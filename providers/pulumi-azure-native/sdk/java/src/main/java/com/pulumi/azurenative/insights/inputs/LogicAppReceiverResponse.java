// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A logic app receiver.
 * 
 */
public final class LogicAppReceiverResponse extends com.pulumi.resources.InvokeArgs {

    public static final LogicAppReceiverResponse Empty = new LogicAppReceiverResponse();

    /**
     * The callback url where http request sent to.
     * 
     */
    @Import(name="callbackUrl", required=true)
      private final String callbackUrl;

    public String callbackUrl() {
        return this.callbackUrl;
    }

    /**
     * The name of the logic app receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The azure resource id of the logic app receiver.
     * 
     */
    @Import(name="resourceId", required=true)
      private final String resourceId;

    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Indicates whether to use common alert schema.
     * 
     */
    @Import(name="useCommonAlertSchema")
      private final @Nullable Boolean useCommonAlertSchema;

    public Optional<Boolean> useCommonAlertSchema() {
        return this.useCommonAlertSchema == null ? Optional.empty() : Optional.ofNullable(this.useCommonAlertSchema);
    }

    public LogicAppReceiverResponse(
        String callbackUrl,
        String name,
        String resourceId,
        @Nullable Boolean useCommonAlertSchema) {
        this.callbackUrl = Objects.requireNonNull(callbackUrl, "expected parameter 'callbackUrl' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.useCommonAlertSchema = useCommonAlertSchema == null ? false : useCommonAlertSchema;
    }

    private LogicAppReceiverResponse() {
        this.callbackUrl = null;
        this.name = null;
        this.resourceId = null;
        this.useCommonAlertSchema = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogicAppReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String callbackUrl;
        private String name;
        private String resourceId;
        private @Nullable Boolean useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(LogicAppReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackUrl = defaults.callbackUrl;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = Objects.requireNonNull(callbackUrl);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder useCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }        public LogicAppReceiverResponse build() {
            return new LogicAppReceiverResponse(callbackUrl, name, resourceId, useCommonAlertSchema);
        }
    }
}
