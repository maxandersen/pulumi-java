// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents security alert timeline item.
 * 
 */
public final class SecurityAlertTimelineItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final SecurityAlertTimelineItemResponse Empty = new SecurityAlertTimelineItemResponse();

    /**
     * The name of the alert type.
     * 
     */
    @Import(name="alertType", required=true)
      private final String alertType;

    public String alertType() {
        return this.alertType;
    }

    /**
     * The alert azure resource id.
     * 
     */
    @Import(name="azureResourceId", required=true)
      private final String azureResourceId;

    public String azureResourceId() {
        return this.azureResourceId;
    }

    /**
     * The alert description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The alert name.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * The alert end time.
     * 
     */
    @Import(name="endTimeUtc", required=true)
      private final String endTimeUtc;

    public String endTimeUtc() {
        return this.endTimeUtc;
    }

    /**
     * The entity query kind
     * Expected value is &#39;SecurityAlert&#39;.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * The alert product name.
     * 
     */
    @Import(name="productName")
      private final @Nullable String productName;

    public Optional<String> productName() {
        return this.productName == null ? Optional.empty() : Optional.ofNullable(this.productName);
    }

    /**
     * The alert severity.
     * 
     */
    @Import(name="severity", required=true)
      private final String severity;

    public String severity() {
        return this.severity;
    }

    /**
     * The alert start time.
     * 
     */
    @Import(name="startTimeUtc", required=true)
      private final String startTimeUtc;

    public String startTimeUtc() {
        return this.startTimeUtc;
    }

    /**
     * The alert generated time.
     * 
     */
    @Import(name="timeGenerated", required=true)
      private final String timeGenerated;

    public String timeGenerated() {
        return this.timeGenerated;
    }

    public SecurityAlertTimelineItemResponse(
        String alertType,
        String azureResourceId,
        @Nullable String description,
        String displayName,
        String endTimeUtc,
        String kind,
        @Nullable String productName,
        String severity,
        String startTimeUtc,
        String timeGenerated) {
        this.alertType = Objects.requireNonNull(alertType, "expected parameter 'alertType' to be non-null");
        this.azureResourceId = Objects.requireNonNull(azureResourceId, "expected parameter 'azureResourceId' to be non-null");
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.endTimeUtc = Objects.requireNonNull(endTimeUtc, "expected parameter 'endTimeUtc' to be non-null");
        this.kind = Codegen.stringProp("kind").arg(kind).require();
        this.productName = productName;
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
        this.startTimeUtc = Objects.requireNonNull(startTimeUtc, "expected parameter 'startTimeUtc' to be non-null");
        this.timeGenerated = Objects.requireNonNull(timeGenerated, "expected parameter 'timeGenerated' to be non-null");
    }

    private SecurityAlertTimelineItemResponse() {
        this.alertType = null;
        this.azureResourceId = null;
        this.description = null;
        this.displayName = null;
        this.endTimeUtc = null;
        this.kind = null;
        this.productName = null;
        this.severity = null;
        this.startTimeUtc = null;
        this.timeGenerated = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityAlertTimelineItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alertType;
        private String azureResourceId;
        private @Nullable String description;
        private String displayName;
        private String endTimeUtc;
        private String kind;
        private @Nullable String productName;
        private String severity;
        private String startTimeUtc;
        private String timeGenerated;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityAlertTimelineItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertType = defaults.alertType;
    	      this.azureResourceId = defaults.azureResourceId;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.endTimeUtc = defaults.endTimeUtc;
    	      this.kind = defaults.kind;
    	      this.productName = defaults.productName;
    	      this.severity = defaults.severity;
    	      this.startTimeUtc = defaults.startTimeUtc;
    	      this.timeGenerated = defaults.timeGenerated;
        }

        public Builder alertType(String alertType) {
            this.alertType = Objects.requireNonNull(alertType);
            return this;
        }
        public Builder azureResourceId(String azureResourceId) {
            this.azureResourceId = Objects.requireNonNull(azureResourceId);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder endTimeUtc(String endTimeUtc) {
            this.endTimeUtc = Objects.requireNonNull(endTimeUtc);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder productName(@Nullable String productName) {
            this.productName = productName;
            return this;
        }
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder startTimeUtc(String startTimeUtc) {
            this.startTimeUtc = Objects.requireNonNull(startTimeUtc);
            return this;
        }
        public Builder timeGenerated(String timeGenerated) {
            this.timeGenerated = Objects.requireNonNull(timeGenerated);
            return this;
        }        public SecurityAlertTimelineItemResponse build() {
            return new SecurityAlertTimelineItemResponse(alertType, azureResourceId, description, displayName, endTimeUtc, kind, productName, severity, startTimeUtc, timeGenerated);
        }
    }
}
