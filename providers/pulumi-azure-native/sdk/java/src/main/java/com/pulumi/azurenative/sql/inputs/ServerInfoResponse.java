// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Server info for the server trust group.
 * 
 */
public final class ServerInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServerInfoResponse Empty = new ServerInfoResponse();

    /**
     * Server Id.
     * 
     */
    @Import(name="serverId", required=true)
    private String serverId;

    public String serverId() {
        return this.serverId;
    }

    private ServerInfoResponse() {}

    private ServerInfoResponse(ServerInfoResponse $) {
        this.serverId = $.serverId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerInfoResponse $;

        public Builder() {
            $ = new ServerInfoResponse();
        }

        public Builder(ServerInfoResponse defaults) {
            $ = new ServerInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder serverId(String serverId) {
            $.serverId = serverId;
            return this;
        }

        public ServerInfoResponse build() {
            $.serverId = Objects.requireNonNull($.serverId, "expected parameter 'serverId' to be non-null");
            return $;
        }
    }

}
