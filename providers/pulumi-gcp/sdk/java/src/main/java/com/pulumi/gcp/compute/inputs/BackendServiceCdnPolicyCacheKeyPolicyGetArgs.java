// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendServiceCdnPolicyCacheKeyPolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceCdnPolicyCacheKeyPolicyGetArgs Empty = new BackendServiceCdnPolicyCacheKeyPolicyGetArgs();

    /**
     * If true requests to different hosts will be cached separately.
     * 
     */
    @Import(name="includeHost")
      private final @Nullable Output<Boolean> includeHost;

    public Output<Boolean> includeHost() {
        return this.includeHost == null ? Codegen.empty() : this.includeHost;
    }

    /**
     * If true, http and https requests will be cached separately.
     * 
     */
    @Import(name="includeProtocol")
      private final @Nullable Output<Boolean> includeProtocol;

    public Output<Boolean> includeProtocol() {
        return this.includeProtocol == null ? Codegen.empty() : this.includeProtocol;
    }

    /**
     * If true, include query string parameters in the cache key
     * according to query_string_whitelist and
     * query_string_blacklist. If neither is set, the entire query
     * string will be included.
     * If false, the query string will be excluded from the cache
     * key entirely.
     * 
     */
    @Import(name="includeQueryString")
      private final @Nullable Output<Boolean> includeQueryString;

    public Output<Boolean> includeQueryString() {
        return this.includeQueryString == null ? Codegen.empty() : this.includeQueryString;
    }

    /**
     * Names of query string parameters to exclude in cache keys.
     * All other parameters will be included. Either specify
     * query_string_whitelist or query_string_blacklist, not both.
     * &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as
     * delimiters.
     * 
     */
    @Import(name="queryStringBlacklists")
      private final @Nullable Output<List<String>> queryStringBlacklists;

    public Output<List<String>> queryStringBlacklists() {
        return this.queryStringBlacklists == null ? Codegen.empty() : this.queryStringBlacklists;
    }

    /**
     * Names of query string parameters to include in cache keys.
     * All other parameters will be excluded. Either specify
     * query_string_whitelist or query_string_blacklist, not both.
     * &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as
     * delimiters.
     * 
     */
    @Import(name="queryStringWhitelists")
      private final @Nullable Output<List<String>> queryStringWhitelists;

    public Output<List<String>> queryStringWhitelists() {
        return this.queryStringWhitelists == null ? Codegen.empty() : this.queryStringWhitelists;
    }

    public BackendServiceCdnPolicyCacheKeyPolicyGetArgs(
        @Nullable Output<Boolean> includeHost,
        @Nullable Output<Boolean> includeProtocol,
        @Nullable Output<Boolean> includeQueryString,
        @Nullable Output<List<String>> queryStringBlacklists,
        @Nullable Output<List<String>> queryStringWhitelists) {
        this.includeHost = includeHost;
        this.includeProtocol = includeProtocol;
        this.includeQueryString = includeQueryString;
        this.queryStringBlacklists = queryStringBlacklists;
        this.queryStringWhitelists = queryStringWhitelists;
    }

    private BackendServiceCdnPolicyCacheKeyPolicyGetArgs() {
        this.includeHost = Codegen.empty();
        this.includeProtocol = Codegen.empty();
        this.includeQueryString = Codegen.empty();
        this.queryStringBlacklists = Codegen.empty();
        this.queryStringWhitelists = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceCdnPolicyCacheKeyPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> includeHost;
        private @Nullable Output<Boolean> includeProtocol;
        private @Nullable Output<Boolean> includeQueryString;
        private @Nullable Output<List<String>> queryStringBlacklists;
        private @Nullable Output<List<String>> queryStringWhitelists;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceCdnPolicyCacheKeyPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeHost = defaults.includeHost;
    	      this.includeProtocol = defaults.includeProtocol;
    	      this.includeQueryString = defaults.includeQueryString;
    	      this.queryStringBlacklists = defaults.queryStringBlacklists;
    	      this.queryStringWhitelists = defaults.queryStringWhitelists;
        }

        public Builder includeHost(@Nullable Output<Boolean> includeHost) {
            this.includeHost = includeHost;
            return this;
        }
        public Builder includeHost(@Nullable Boolean includeHost) {
            this.includeHost = Codegen.ofNullable(includeHost);
            return this;
        }
        public Builder includeProtocol(@Nullable Output<Boolean> includeProtocol) {
            this.includeProtocol = includeProtocol;
            return this;
        }
        public Builder includeProtocol(@Nullable Boolean includeProtocol) {
            this.includeProtocol = Codegen.ofNullable(includeProtocol);
            return this;
        }
        public Builder includeQueryString(@Nullable Output<Boolean> includeQueryString) {
            this.includeQueryString = includeQueryString;
            return this;
        }
        public Builder includeQueryString(@Nullable Boolean includeQueryString) {
            this.includeQueryString = Codegen.ofNullable(includeQueryString);
            return this;
        }
        public Builder queryStringBlacklists(@Nullable Output<List<String>> queryStringBlacklists) {
            this.queryStringBlacklists = queryStringBlacklists;
            return this;
        }
        public Builder queryStringBlacklists(@Nullable List<String> queryStringBlacklists) {
            this.queryStringBlacklists = Codegen.ofNullable(queryStringBlacklists);
            return this;
        }
        public Builder queryStringBlacklists(String... queryStringBlacklists) {
            return queryStringBlacklists(List.of(queryStringBlacklists));
        }
        public Builder queryStringWhitelists(@Nullable Output<List<String>> queryStringWhitelists) {
            this.queryStringWhitelists = queryStringWhitelists;
            return this;
        }
        public Builder queryStringWhitelists(@Nullable List<String> queryStringWhitelists) {
            this.queryStringWhitelists = Codegen.ofNullable(queryStringWhitelists);
            return this;
        }
        public Builder queryStringWhitelists(String... queryStringWhitelists) {
            return queryStringWhitelists(List.of(queryStringWhitelists));
        }        public BackendServiceCdnPolicyCacheKeyPolicyGetArgs build() {
            return new BackendServiceCdnPolicyCacheKeyPolicyGetArgs(includeHost, includeProtocol, includeQueryString, queryStringBlacklists, queryStringWhitelists);
        }
    }
}
