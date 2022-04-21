// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network ACL
 * 
 */
public final class NetworkACLResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkACLResponse Empty = new NetworkACLResponse();

    /**
     * Allowed request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
     */
    @Import(name="allow")
    private @Nullable List<String> allow;

    public Optional<List<String>> allow() {
        return Optional.ofNullable(this.allow);
    }

    /**
     * Denied request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
     */
    @Import(name="deny")
    private @Nullable List<String> deny;

    public Optional<List<String>> deny() {
        return Optional.ofNullable(this.deny);
    }

    private NetworkACLResponse() {}

    private NetworkACLResponse(NetworkACLResponse $) {
        this.allow = $.allow;
        this.deny = $.deny;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkACLResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkACLResponse $;

        public Builder() {
            $ = new NetworkACLResponse();
        }

        public Builder(NetworkACLResponse defaults) {
            $ = new NetworkACLResponse(Objects.requireNonNull(defaults));
        }

        public Builder allow(@Nullable List<String> allow) {
            $.allow = allow;
            return this;
        }

        public Builder allow(String... allow) {
            return allow(List.of(allow));
        }

        public Builder deny(@Nullable List<String> deny) {
            $.deny = deny;
            return this;
        }

        public Builder deny(String... deny) {
            return deny(List.of(deny));
        }

        public NetworkACLResponse build() {
            return $;
        }
    }

}
