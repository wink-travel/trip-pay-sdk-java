package io.trippay.sdk.payment.event;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.beans.ConstructorProperties;
import java.time.LocalDateTime;

/**
 * Created on: 2/15/23.
 *
 * @author Bjorn Harvold
 * Responsibility: Is the main webhook object that wraps the domain object where the event occurred
 */
@Value
public class TripPayEvent {
    String id;

    LocalDateTime createdDate;

    LocalDateTime lastUpdate;

    @NotNull(message = "type is required")
    String type;

    @NotNull(message = "data is required")
    JsonNode object;

    @ConstructorProperties({
            "id",
            "createdDate",
            "lastUpdate",
            "type",
            "data"
    })
    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public TripPayEvent(
            @JsonProperty("id") String id,
            @JsonProperty("createdDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime createdDate,
            @JsonProperty("lastUpdate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime lastUpdate,
            @JsonProperty(value = "type", required = true) @NotNull(message = "type is required") String type,
            @JsonProperty(value = "object", required = true) @NotNull(message = "object is required") JsonNode object
    ) {
        this.id = id;
        this.createdDate = createdDate;
        this.lastUpdate = lastUpdate;
        this.type = type;
        this.object = object;
    }

}
