// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.TlsPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The login server properties of the connected registry.
 * 
 */
public final class LoginServerPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final LoginServerPropertiesResponse Empty = new LoginServerPropertiesResponse();

    /**
     * The host of the connected registry. Can be FQDN or IP.
     * 
     */
    @Import(name="host", required=true)
      private final String host;

    public String host() {
        return this.host;
    }

    /**
     * The TLS properties of the connected registry login server.
     * 
     */
    @Import(name="tls", required=true)
      private final TlsPropertiesResponse tls;

    public TlsPropertiesResponse tls() {
        return this.tls;
    }

    public LoginServerPropertiesResponse(
        String host,
        TlsPropertiesResponse tls) {
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.tls = Objects.requireNonNull(tls, "expected parameter 'tls' to be non-null");
    }

    private LoginServerPropertiesResponse() {
        this.host = null;
        this.tls = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoginServerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private TlsPropertiesResponse tls;

        public Builder() {
    	      // Empty
        }

        public Builder(LoginServerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.tls = defaults.tls;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder tls(TlsPropertiesResponse tls) {
            this.tls = Objects.requireNonNull(tls);
            return this;
        }        public LoginServerPropertiesResponse build() {
            return new LoginServerPropertiesResponse(host, tls);
        }
    }
}
