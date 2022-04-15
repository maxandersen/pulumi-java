// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.securitycenter_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNotificationConfigArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNotificationConfigArgs Empty = new GetNotificationConfigArgs();

    @Import(name="notificationConfigId", required=true)
      private final String notificationConfigId;

    public String notificationConfigId() {
        return this.notificationConfigId;
    }

    @Import(name="organizationId", required=true)
      private final String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    public GetNotificationConfigArgs(
        String notificationConfigId,
        String organizationId) {
        this.notificationConfigId = Objects.requireNonNull(notificationConfigId, "expected parameter 'notificationConfigId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetNotificationConfigArgs() {
        this.notificationConfigId = null;
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String notificationConfigId;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotificationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notificationConfigId = defaults.notificationConfigId;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder notificationConfigId(String notificationConfigId) {
            this.notificationConfigId = Objects.requireNonNull(notificationConfigId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }        public GetNotificationConfigArgs build() {
            return new GetNotificationConfigArgs(notificationConfigId, organizationId);
        }
    }
}
