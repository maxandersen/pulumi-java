// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs;
import com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs();

    /**
     * For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be part of the original URL.
     * 
     */
    @Import(name="fullPathMatch")
    private @Nullable Output<String> fullPathMatch;

    public Optional<Output<String>> fullPathMatch() {
        return Optional.ofNullable(this.fullPathMatch);
    }

    /**
     * Specifies a list of header match criteria, all of which must match corresponding headers in the request.
     * Structure is documented below.
     * 
     */
    @Import(name="headerMatches")
    private @Nullable Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs>> headerMatches;

    public Optional<Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs>>> headerMatches() {
        return Optional.ofNullable(this.headerMatches);
    }

    /**
     * Specifies that prefixMatch and fullPathMatch matches are case sensitive.
     * 
     */
    @Import(name="ignoreCase")
    private @Nullable Output<Boolean> ignoreCase;

    public Optional<Output<Boolean>> ignoreCase() {
        return Optional.ofNullable(this.ignoreCase);
    }

    /**
     * For satisfying the matchRule condition, the path of the request
     * must match the wildcard pattern specified in pathTemplateMatch
     * after removing any query parameters and anchor that may be part
     * of the original URL.
     * pathTemplateMatch must be between 1 and 255 characters
     * (inclusive).  The pattern specified by pathTemplateMatch may
     * have at most 5 wildcard operators and at most 5 variable
     * captures in total.
     * 
     */
    @Import(name="pathTemplateMatch")
    private @Nullable Output<String> pathTemplateMatch;

    public Optional<Output<String>> pathTemplateMatch() {
        return Optional.ofNullable(this.pathTemplateMatch);
    }

    /**
     * The value of the header must start with the contents of prefixMatch.
     * 
     */
    @Import(name="prefixMatch")
    private @Nullable Output<String> prefixMatch;

    public Optional<Output<String>> prefixMatch() {
        return Optional.ofNullable(this.prefixMatch);
    }

    /**
     * Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request.
     * Structure is documented below.
     * 
     */
    @Import(name="queryParameterMatches")
    private @Nullable Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>> queryParameterMatches;

    public Optional<Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>>> queryParameterMatches() {
        return Optional.ofNullable(this.queryParameterMatches);
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs() {}

    private EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs $) {
        this.fullPathMatch = $.fullPathMatch;
        this.headerMatches = $.headerMatches;
        this.ignoreCase = $.ignoreCase;
        this.pathTemplateMatch = $.pathTemplateMatch;
        this.prefixMatch = $.prefixMatch;
        this.queryParameterMatches = $.queryParameterMatches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs $;

        public Builder() {
            $ = new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs();
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs defaults) {
            $ = new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder fullPathMatch(@Nullable Output<String> fullPathMatch) {
            $.fullPathMatch = fullPathMatch;
            return this;
        }

        public Builder fullPathMatch(String fullPathMatch) {
            return fullPathMatch(Output.of(fullPathMatch));
        }

        public Builder headerMatches(@Nullable Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs>> headerMatches) {
            $.headerMatches = headerMatches;
            return this;
        }

        public Builder headerMatches(List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs> headerMatches) {
            return headerMatches(Output.of(headerMatches));
        }

        public Builder headerMatches(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs... headerMatches) {
            return headerMatches(List.of(headerMatches));
        }

        public Builder ignoreCase(@Nullable Output<Boolean> ignoreCase) {
            $.ignoreCase = ignoreCase;
            return this;
        }

        public Builder ignoreCase(Boolean ignoreCase) {
            return ignoreCase(Output.of(ignoreCase));
        }

        public Builder pathTemplateMatch(@Nullable Output<String> pathTemplateMatch) {
            $.pathTemplateMatch = pathTemplateMatch;
            return this;
        }

        public Builder pathTemplateMatch(String pathTemplateMatch) {
            return pathTemplateMatch(Output.of(pathTemplateMatch));
        }

        public Builder prefixMatch(@Nullable Output<String> prefixMatch) {
            $.prefixMatch = prefixMatch;
            return this;
        }

        public Builder prefixMatch(String prefixMatch) {
            return prefixMatch(Output.of(prefixMatch));
        }

        public Builder queryParameterMatches(@Nullable Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>> queryParameterMatches) {
            $.queryParameterMatches = queryParameterMatches;
            return this;
        }

        public Builder queryParameterMatches(List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs> queryParameterMatches) {
            return queryParameterMatches(Output.of(queryParameterMatches));
        }

        public Builder queryParameterMatches(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs... queryParameterMatches) {
            return queryParameterMatches(List.of(queryParameterMatches));
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs build() {
            return $;
        }
    }

}
