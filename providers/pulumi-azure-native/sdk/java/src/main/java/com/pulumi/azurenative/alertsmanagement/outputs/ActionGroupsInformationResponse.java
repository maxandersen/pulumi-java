// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ActionGroupsInformationResponse {
    /**
     * @return An optional custom email subject to use in email notifications.
     * 
     */
    private final @Nullable String customEmailSubject;
    /**
     * @return An optional custom web-hook payload to use in web-hook notifications.
     * 
     */
    private final @Nullable String customWebhookPayload;
    /**
     * @return The Action Group resource IDs.
     * 
     */
    private final List<String> groupIds;

    @CustomType.Constructor
    private ActionGroupsInformationResponse(
        @CustomType.Parameter("customEmailSubject") @Nullable String customEmailSubject,
        @CustomType.Parameter("customWebhookPayload") @Nullable String customWebhookPayload,
        @CustomType.Parameter("groupIds") List<String> groupIds) {
        this.customEmailSubject = customEmailSubject;
        this.customWebhookPayload = customWebhookPayload;
        this.groupIds = groupIds;
    }

    /**
     * @return An optional custom email subject to use in email notifications.
     * 
     */
    public Optional<String> customEmailSubject() {
        return Optional.ofNullable(this.customEmailSubject);
    }
    /**
     * @return An optional custom web-hook payload to use in web-hook notifications.
     * 
     */
    public Optional<String> customWebhookPayload() {
        return Optional.ofNullable(this.customWebhookPayload);
    }
    /**
     * @return The Action Group resource IDs.
     * 
     */
    public List<String> groupIds() {
        return this.groupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionGroupsInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customEmailSubject;
        private @Nullable String customWebhookPayload;
        private List<String> groupIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionGroupsInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customEmailSubject = defaults.customEmailSubject;
    	      this.customWebhookPayload = defaults.customWebhookPayload;
    	      this.groupIds = defaults.groupIds;
        }

        public Builder customEmailSubject(@Nullable String customEmailSubject) {
            this.customEmailSubject = customEmailSubject;
            return this;
        }
        public Builder customWebhookPayload(@Nullable String customWebhookPayload) {
            this.customWebhookPayload = customWebhookPayload;
            return this;
        }
        public Builder groupIds(List<String> groupIds) {
            this.groupIds = Objects.requireNonNull(groupIds);
            return this;
        }
        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }        public ActionGroupsInformationResponse build() {
            return new ActionGroupsInformationResponse(customEmailSubject, customWebhookPayload, groupIds);
        }
    }
}
