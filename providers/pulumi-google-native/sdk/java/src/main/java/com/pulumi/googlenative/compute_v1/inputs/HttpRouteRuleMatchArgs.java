// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_v1.inputs.HttpHeaderMatchArgs;
import com.pulumi.googlenative.compute_v1.inputs.HttpQueryParameterMatchArgs;
import com.pulumi.googlenative.compute_v1.inputs.MetadataFilterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HttpRouteRuleMatch specifies a set of criteria for matching requests to an HttpRouteRule. All specified criteria must be satisfied for a match to occur.
 * 
 */
public final class HttpRouteRuleMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpRouteRuleMatchArgs Empty = new HttpRouteRuleMatchArgs();

    /**
     * For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be part of the original URL. fullPathMatch must be from 1 to 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
     * 
     */
    @Import(name="fullPathMatch")
      private final @Nullable Output<String> fullPathMatch;

    public Output<String> fullPathMatch() {
        return this.fullPathMatch == null ? Codegen.empty() : this.fullPathMatch;
    }

    /**
     * Specifies a list of header match criteria, all of which must match corresponding headers in the request.
     * 
     */
    @Import(name="headerMatches")
      private final @Nullable Output<List<HttpHeaderMatchArgs>> headerMatches;

    public Output<List<HttpHeaderMatchArgs>> headerMatches() {
        return this.headerMatches == null ? Codegen.empty() : this.headerMatches;
    }

    /**
     * Specifies that prefixMatch and fullPathMatch matches are case sensitive. The default value is false. ignoreCase must not be used with regexMatch. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @Import(name="ignoreCase")
      private final @Nullable Output<Boolean> ignoreCase;

    public Output<Boolean> ignoreCase() {
        return this.ignoreCase == null ? Codegen.empty() : this.ignoreCase;
    }

    /**
     * Opaque filter criteria used by the load balancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to the load balancer, xDS clients present node metadata. When there is a match, the relevant routing configuration is made available to those proxies. For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadata filters are specified, all of them need to be satisfied in order to be considered a match. metadataFilters specified here is applied after those specified in ForwardingRule that refers to the UrlMap this HttpRouteRuleMatch belongs to. metadataFilters only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="metadataFilters")
      private final @Nullable Output<List<MetadataFilterArgs>> metadataFilters;

    public Output<List<MetadataFilterArgs>> metadataFilters() {
        return this.metadataFilters == null ? Codegen.empty() : this.metadataFilters;
    }

    /**
     * For satisfying the matchRule condition, the request&#39;s path must begin with the specified prefixMatch. prefixMatch must begin with a /. The value must be from 1 to 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
     * 
     */
    @Import(name="prefixMatch")
      private final @Nullable Output<String> prefixMatch;

    public Output<String> prefixMatch() {
        return this.prefixMatch == null ? Codegen.empty() : this.prefixMatch;
    }

    /**
     * Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @Import(name="queryParameterMatches")
      private final @Nullable Output<List<HttpQueryParameterMatchArgs>> queryParameterMatches;

    public Output<List<HttpQueryParameterMatchArgs>> queryParameterMatches() {
        return this.queryParameterMatches == null ? Codegen.empty() : this.queryParameterMatches;
    }

    /**
     * For satisfying the matchRule condition, the path of the request must satisfy the regular expression specified in regexMatch after removing any query parameters and anchor supplied with the original URL. For more information about regular expression syntax, see Syntax. Only one of prefixMatch, fullPathMatch or regexMatch must be specified. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="regexMatch")
      private final @Nullable Output<String> regexMatch;

    public Output<String> regexMatch() {
        return this.regexMatch == null ? Codegen.empty() : this.regexMatch;
    }

    public HttpRouteRuleMatchArgs(
        @Nullable Output<String> fullPathMatch,
        @Nullable Output<List<HttpHeaderMatchArgs>> headerMatches,
        @Nullable Output<Boolean> ignoreCase,
        @Nullable Output<List<MetadataFilterArgs>> metadataFilters,
        @Nullable Output<String> prefixMatch,
        @Nullable Output<List<HttpQueryParameterMatchArgs>> queryParameterMatches,
        @Nullable Output<String> regexMatch) {
        this.fullPathMatch = fullPathMatch;
        this.headerMatches = headerMatches;
        this.ignoreCase = ignoreCase;
        this.metadataFilters = metadataFilters;
        this.prefixMatch = prefixMatch;
        this.queryParameterMatches = queryParameterMatches;
        this.regexMatch = regexMatch;
    }

    private HttpRouteRuleMatchArgs() {
        this.fullPathMatch = Codegen.empty();
        this.headerMatches = Codegen.empty();
        this.ignoreCase = Codegen.empty();
        this.metadataFilters = Codegen.empty();
        this.prefixMatch = Codegen.empty();
        this.queryParameterMatches = Codegen.empty();
        this.regexMatch = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteRuleMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fullPathMatch;
        private @Nullable Output<List<HttpHeaderMatchArgs>> headerMatches;
        private @Nullable Output<Boolean> ignoreCase;
        private @Nullable Output<List<MetadataFilterArgs>> metadataFilters;
        private @Nullable Output<String> prefixMatch;
        private @Nullable Output<List<HttpQueryParameterMatchArgs>> queryParameterMatches;
        private @Nullable Output<String> regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteRuleMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullPathMatch = defaults.fullPathMatch;
    	      this.headerMatches = defaults.headerMatches;
    	      this.ignoreCase = defaults.ignoreCase;
    	      this.metadataFilters = defaults.metadataFilters;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.queryParameterMatches = defaults.queryParameterMatches;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder fullPathMatch(@Nullable Output<String> fullPathMatch) {
            this.fullPathMatch = fullPathMatch;
            return this;
        }
        public Builder fullPathMatch(@Nullable String fullPathMatch) {
            this.fullPathMatch = Codegen.ofNullable(fullPathMatch);
            return this;
        }
        public Builder headerMatches(@Nullable Output<List<HttpHeaderMatchArgs>> headerMatches) {
            this.headerMatches = headerMatches;
            return this;
        }
        public Builder headerMatches(@Nullable List<HttpHeaderMatchArgs> headerMatches) {
            this.headerMatches = Codegen.ofNullable(headerMatches);
            return this;
        }
        public Builder headerMatches(HttpHeaderMatchArgs... headerMatches) {
            return headerMatches(List.of(headerMatches));
        }
        public Builder ignoreCase(@Nullable Output<Boolean> ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        public Builder ignoreCase(@Nullable Boolean ignoreCase) {
            this.ignoreCase = Codegen.ofNullable(ignoreCase);
            return this;
        }
        public Builder metadataFilters(@Nullable Output<List<MetadataFilterArgs>> metadataFilters) {
            this.metadataFilters = metadataFilters;
            return this;
        }
        public Builder metadataFilters(@Nullable List<MetadataFilterArgs> metadataFilters) {
            this.metadataFilters = Codegen.ofNullable(metadataFilters);
            return this;
        }
        public Builder metadataFilters(MetadataFilterArgs... metadataFilters) {
            return metadataFilters(List.of(metadataFilters));
        }
        public Builder prefixMatch(@Nullable Output<String> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }
        public Builder prefixMatch(@Nullable String prefixMatch) {
            this.prefixMatch = Codegen.ofNullable(prefixMatch);
            return this;
        }
        public Builder queryParameterMatches(@Nullable Output<List<HttpQueryParameterMatchArgs>> queryParameterMatches) {
            this.queryParameterMatches = queryParameterMatches;
            return this;
        }
        public Builder queryParameterMatches(@Nullable List<HttpQueryParameterMatchArgs> queryParameterMatches) {
            this.queryParameterMatches = Codegen.ofNullable(queryParameterMatches);
            return this;
        }
        public Builder queryParameterMatches(HttpQueryParameterMatchArgs... queryParameterMatches) {
            return queryParameterMatches(List.of(queryParameterMatches));
        }
        public Builder regexMatch(@Nullable Output<String> regexMatch) {
            this.regexMatch = regexMatch;
            return this;
        }
        public Builder regexMatch(@Nullable String regexMatch) {
            this.regexMatch = Codegen.ofNullable(regexMatch);
            return this;
        }        public HttpRouteRuleMatchArgs build() {
            return new HttpRouteRuleMatchArgs(fullPathMatch, headerMatches, ignoreCase, metadataFilters, prefixMatch, queryParameterMatches, regexMatch);
        }
    }
}
