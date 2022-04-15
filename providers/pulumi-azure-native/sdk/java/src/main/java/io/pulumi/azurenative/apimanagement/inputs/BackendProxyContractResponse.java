// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the Backend WebProxy Server to use in the Request to Backend.
 * 
 */
public final class BackendProxyContractResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendProxyContractResponse Empty = new BackendProxyContractResponse();

    /**
     * Password to connect to the WebProxy Server
     * 
     */
    @Import(name="password")
      private final @Nullable String password;

    public Optional<String> password() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * WebProxy Server AbsoluteUri property which includes the entire URI stored in the Uri instance, including all fragments and query strings.
     * 
     */
    @Import(name="url", required=true)
      private final String url;

    public String url() {
        return this.url;
    }

    /**
     * Username to connect to the WebProxy server
     * 
     */
    @Import(name="username")
      private final @Nullable String username;

    public Optional<String> username() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public BackendProxyContractResponse(
        @Nullable String password,
        String url,
        @Nullable String username) {
        this.password = password;
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.username = username;
    }

    private BackendProxyContractResponse() {
        this.password = null;
        this.url = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendProxyContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private String url;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendProxyContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public BackendProxyContractResponse build() {
            return new BackendProxyContractResponse(password, url, username);
        }
    }
}
