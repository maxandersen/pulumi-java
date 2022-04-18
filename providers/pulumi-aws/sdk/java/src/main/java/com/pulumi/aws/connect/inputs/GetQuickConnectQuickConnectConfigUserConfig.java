// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetQuickConnectQuickConnectConfigUserConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetQuickConnectQuickConnectConfigUserConfig Empty = new GetQuickConnectQuickConnectConfigUserConfig();

    /**
     * Specifies the identifier of the contact flow.
     * 
     */
    @Import(name="contactFlowId", required=true)
      private final String contactFlowId;

    public String contactFlowId() {
        return this.contactFlowId;
    }

    /**
     * Specifies the identifier for the user.
     * 
     */
    @Import(name="userId", required=true)
      private final String userId;

    public String userId() {
        return this.userId;
    }

    public GetQuickConnectQuickConnectConfigUserConfig(
        String contactFlowId,
        String userId) {
        this.contactFlowId = Objects.requireNonNull(contactFlowId, "expected parameter 'contactFlowId' to be non-null");
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private GetQuickConnectQuickConnectConfigUserConfig() {
        this.contactFlowId = null;
        this.userId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQuickConnectQuickConnectConfigUserConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactFlowId;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQuickConnectQuickConnectConfigUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactFlowId = defaults.contactFlowId;
    	      this.userId = defaults.userId;
        }

        public Builder contactFlowId(String contactFlowId) {
            this.contactFlowId = Objects.requireNonNull(contactFlowId);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }        public GetQuickConnectQuickConnectConfigUserConfig build() {
            return new GetQuickConnectQuickConnectConfigUserConfig(contactFlowId, userId);
        }
    }
}
