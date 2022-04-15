// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class NetworkACLResponse {
    /**
     * Allowed request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
     */
    private final @Nullable List<String> allow;
    /**
     * Denied request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
     */
    private final @Nullable List<String> deny;

    @CustomType.Constructor
    private NetworkACLResponse(
        @CustomType.Parameter("allow") @Nullable List<String> allow,
        @CustomType.Parameter("deny") @Nullable List<String> deny) {
        this.allow = allow;
        this.deny = deny;
    }

    /**
     * Allowed request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
    */
    public List<String> allow() {
        return this.allow == null ? List.of() : this.allow;
    }
    /**
     * Denied request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
    */
    public List<String> deny() {
        return this.deny == null ? List.of() : this.deny;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkACLResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allow;
        private @Nullable List<String> deny;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkACLResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.deny = defaults.deny;
        }

        public Builder allow(@Nullable List<String> allow) {
            this.allow = allow;
            return this;
        }
        public Builder allow(String... allow) {
            return allow(List.of(allow));
        }
        public Builder deny(@Nullable List<String> deny) {
            this.deny = deny;
            return this;
        }
        public Builder deny(String... deny) {
            return deny(List.of(deny));
        }        public NetworkACLResponse build() {
            return new NetworkACLResponse(allow, deny);
        }
    }
}
