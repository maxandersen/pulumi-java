// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ActionGroupResponse {
    /**
     * @return The resource ID of the Action Group. This cannot be null or empty.
     * 
     */
    private final String actionGroupId;
    /**
     * @return the dictionary of custom properties to include with the post operation. These data are appended to the webhook payload.
     * 
     */
    private final @Nullable Map<String,String> webhookProperties;

    @CustomType.Constructor
    private ActionGroupResponse(
        @CustomType.Parameter("actionGroupId") String actionGroupId,
        @CustomType.Parameter("webhookProperties") @Nullable Map<String,String> webhookProperties) {
        this.actionGroupId = actionGroupId;
        this.webhookProperties = webhookProperties;
    }

    /**
     * @return The resource ID of the Action Group. This cannot be null or empty.
     * 
     */
    public String actionGroupId() {
        return this.actionGroupId;
    }
    /**
     * @return the dictionary of custom properties to include with the post operation. These data are appended to the webhook payload.
     * 
     */
    public Map<String,String> webhookProperties() {
        return this.webhookProperties == null ? Map.of() : this.webhookProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionGroupId;
        private @Nullable Map<String,String> webhookProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroupId = defaults.actionGroupId;
    	      this.webhookProperties = defaults.webhookProperties;
        }

        public Builder actionGroupId(String actionGroupId) {
            this.actionGroupId = Objects.requireNonNull(actionGroupId);
            return this;
        }
        public Builder webhookProperties(@Nullable Map<String,String> webhookProperties) {
            this.webhookProperties = webhookProperties;
            return this;
        }        public ActionGroupResponse build() {
            return new ActionGroupResponse(actionGroupId, webhookProperties);
        }
    }
}
