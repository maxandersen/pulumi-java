// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleMatchRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleMatchRuleArgs Empty = new RegionUrlMapPathMatcherRouteRuleMatchRuleArgs();

    /**
     * For satisfying the matchRule condition, the path of the request must exactly
     * match the value specified in fullPathMatch after removing any query parameters
     * and anchor that may be part of the original URL. FullPathMatch must be between 1
     * and 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must
     * be specified.
     * 
     */
    @Import(name="fullPathMatch")
    private @Nullable Output<String> fullPathMatch;

    /**
     * @return For satisfying the matchRule condition, the path of the request must exactly
     * match the value specified in fullPathMatch after removing any query parameters
     * and anchor that may be part of the original URL. FullPathMatch must be between 1
     * and 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must
     * be specified.
     * 
     */
    public Optional<Output<String>> fullPathMatch() {
        return Optional.ofNullable(this.fullPathMatch);
    }

    /**
     * Specifies a list of header match criteria, all of which must match corresponding
     * headers in the request.
     * Structure is documented below.
     * 
     */
    @Import(name="headerMatches")
    private @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs>> headerMatches;

    /**
     * @return Specifies a list of header match criteria, all of which must match corresponding
     * headers in the request.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs>>> headerMatches() {
        return Optional.ofNullable(this.headerMatches);
    }

    /**
     * Specifies that prefixMatch and fullPathMatch matches are case sensitive.
     * Defaults to false.
     * 
     */
    @Import(name="ignoreCase")
    private @Nullable Output<Boolean> ignoreCase;

    /**
     * @return Specifies that prefixMatch and fullPathMatch matches are case sensitive.
     * Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> ignoreCase() {
        return Optional.ofNullable(this.ignoreCase);
    }

    /**
     * Opaque filter criteria used by Loadbalancer to restrict routing configuration to
     * a limited set xDS compliant clients. In their xDS requests to Loadbalancer, xDS
     * clients present node metadata. If a match takes place, the relevant routing
     * configuration is made available to those proxies. For each metadataFilter in
     * this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the
     * filterLabels must match the corresponding label provided in the metadata. If its
     * filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match
     * with corresponding labels in the provided metadata. metadataFilters specified
     * here can be overrides those specified in ForwardingRule that refers to this
     * UrlMap. metadataFilters only applies to Loadbalancers that have their
     * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * 
     */
    @Import(name="metadataFilters")
    private @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs>> metadataFilters;

    /**
     * @return Opaque filter criteria used by Loadbalancer to restrict routing configuration to
     * a limited set xDS compliant clients. In their xDS requests to Loadbalancer, xDS
     * clients present node metadata. If a match takes place, the relevant routing
     * configuration is made available to those proxies. For each metadataFilter in
     * this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the
     * filterLabels must match the corresponding label provided in the metadata. If its
     * filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match
     * with corresponding labels in the provided metadata. metadataFilters specified
     * here can be overrides those specified in ForwardingRule that refers to this
     * UrlMap. metadataFilters only applies to Loadbalancers that have their
     * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs>>> metadataFilters() {
        return Optional.ofNullable(this.metadataFilters);
    }

    /**
     * The value of the header must start with the contents of prefixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    @Import(name="prefixMatch")
    private @Nullable Output<String> prefixMatch;

    /**
     * @return The value of the header must start with the contents of prefixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    public Optional<Output<String>> prefixMatch() {
        return Optional.ofNullable(this.prefixMatch);
    }

    /**
     * Specifies a list of query parameter match criteria, all of which must match
     * corresponding query parameters in the request.
     * Structure is documented below.
     * 
     */
    @Import(name="queryParameterMatches")
    private @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>> queryParameterMatches;

    /**
     * @return Specifies a list of query parameter match criteria, all of which must match
     * corresponding query parameters in the request.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>>> queryParameterMatches() {
        return Optional.ofNullable(this.queryParameterMatches);
    }

    /**
     * The queryParameterMatch matches if the value of the parameter matches the
     * regular expression specified by regexMatch. For the regular expression grammar,
     * please see en.cppreference.com/w/cpp/regex/ecmascript  Only one of presentMatch,
     * exactMatch and regexMatch must be set.
     * 
     */
    @Import(name="regexMatch")
    private @Nullable Output<String> regexMatch;

    /**
     * @return The queryParameterMatch matches if the value of the parameter matches the
     * regular expression specified by regexMatch. For the regular expression grammar,
     * please see en.cppreference.com/w/cpp/regex/ecmascript  Only one of presentMatch,
     * exactMatch and regexMatch must be set.
     * 
     */
    public Optional<Output<String>> regexMatch() {
        return Optional.ofNullable(this.regexMatch);
    }

    private RegionUrlMapPathMatcherRouteRuleMatchRuleArgs() {}

    private RegionUrlMapPathMatcherRouteRuleMatchRuleArgs(RegionUrlMapPathMatcherRouteRuleMatchRuleArgs $) {
        this.fullPathMatch = $.fullPathMatch;
        this.headerMatches = $.headerMatches;
        this.ignoreCase = $.ignoreCase;
        this.metadataFilters = $.metadataFilters;
        this.prefixMatch = $.prefixMatch;
        this.queryParameterMatches = $.queryParameterMatches;
        this.regexMatch = $.regexMatch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapPathMatcherRouteRuleMatchRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapPathMatcherRouteRuleMatchRuleArgs $;

        public Builder() {
            $ = new RegionUrlMapPathMatcherRouteRuleMatchRuleArgs();
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleMatchRuleArgs defaults) {
            $ = new RegionUrlMapPathMatcherRouteRuleMatchRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fullPathMatch For satisfying the matchRule condition, the path of the request must exactly
         * match the value specified in fullPathMatch after removing any query parameters
         * and anchor that may be part of the original URL. FullPathMatch must be between 1
         * and 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must
         * be specified.
         * 
         * @return builder
         * 
         */
        public Builder fullPathMatch(@Nullable Output<String> fullPathMatch) {
            $.fullPathMatch = fullPathMatch;
            return this;
        }

        /**
         * @param fullPathMatch For satisfying the matchRule condition, the path of the request must exactly
         * match the value specified in fullPathMatch after removing any query parameters
         * and anchor that may be part of the original URL. FullPathMatch must be between 1
         * and 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must
         * be specified.
         * 
         * @return builder
         * 
         */
        public Builder fullPathMatch(String fullPathMatch) {
            return fullPathMatch(Output.of(fullPathMatch));
        }

        /**
         * @param headerMatches Specifies a list of header match criteria, all of which must match corresponding
         * headers in the request.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerMatches(@Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs>> headerMatches) {
            $.headerMatches = headerMatches;
            return this;
        }

        /**
         * @param headerMatches Specifies a list of header match criteria, all of which must match corresponding
         * headers in the request.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerMatches(List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs> headerMatches) {
            return headerMatches(Output.of(headerMatches));
        }

        /**
         * @param headerMatches Specifies a list of header match criteria, all of which must match corresponding
         * headers in the request.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerMatches(RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs... headerMatches) {
            return headerMatches(List.of(headerMatches));
        }

        /**
         * @param ignoreCase Specifies that prefixMatch and fullPathMatch matches are case sensitive.
         * Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder ignoreCase(@Nullable Output<Boolean> ignoreCase) {
            $.ignoreCase = ignoreCase;
            return this;
        }

        /**
         * @param ignoreCase Specifies that prefixMatch and fullPathMatch matches are case sensitive.
         * Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder ignoreCase(Boolean ignoreCase) {
            return ignoreCase(Output.of(ignoreCase));
        }

        /**
         * @param metadataFilters Opaque filter criteria used by Loadbalancer to restrict routing configuration to
         * a limited set xDS compliant clients. In their xDS requests to Loadbalancer, xDS
         * clients present node metadata. If a match takes place, the relevant routing
         * configuration is made available to those proxies. For each metadataFilter in
         * this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the
         * filterLabels must match the corresponding label provided in the metadata. If its
         * filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match
         * with corresponding labels in the provided metadata. metadataFilters specified
         * here can be overrides those specified in ForwardingRule that refers to this
         * UrlMap. metadataFilters only applies to Loadbalancers that have their
         * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder metadataFilters(@Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs>> metadataFilters) {
            $.metadataFilters = metadataFilters;
            return this;
        }

        /**
         * @param metadataFilters Opaque filter criteria used by Loadbalancer to restrict routing configuration to
         * a limited set xDS compliant clients. In their xDS requests to Loadbalancer, xDS
         * clients present node metadata. If a match takes place, the relevant routing
         * configuration is made available to those proxies. For each metadataFilter in
         * this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the
         * filterLabels must match the corresponding label provided in the metadata. If its
         * filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match
         * with corresponding labels in the provided metadata. metadataFilters specified
         * here can be overrides those specified in ForwardingRule that refers to this
         * UrlMap. metadataFilters only applies to Loadbalancers that have their
         * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder metadataFilters(List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs> metadataFilters) {
            return metadataFilters(Output.of(metadataFilters));
        }

        /**
         * @param metadataFilters Opaque filter criteria used by Loadbalancer to restrict routing configuration to
         * a limited set xDS compliant clients. In their xDS requests to Loadbalancer, xDS
         * clients present node metadata. If a match takes place, the relevant routing
         * configuration is made available to those proxies. For each metadataFilter in
         * this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the
         * filterLabels must match the corresponding label provided in the metadata. If its
         * filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match
         * with corresponding labels in the provided metadata. metadataFilters specified
         * here can be overrides those specified in ForwardingRule that refers to this
         * UrlMap. metadataFilters only applies to Loadbalancers that have their
         * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder metadataFilters(RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs... metadataFilters) {
            return metadataFilters(List.of(metadataFilters));
        }

        /**
         * @param prefixMatch The value of the header must start with the contents of prefixMatch. Only one of
         * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
         * must be set.
         * 
         * @return builder
         * 
         */
        public Builder prefixMatch(@Nullable Output<String> prefixMatch) {
            $.prefixMatch = prefixMatch;
            return this;
        }

        /**
         * @param prefixMatch The value of the header must start with the contents of prefixMatch. Only one of
         * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
         * must be set.
         * 
         * @return builder
         * 
         */
        public Builder prefixMatch(String prefixMatch) {
            return prefixMatch(Output.of(prefixMatch));
        }

        /**
         * @param queryParameterMatches Specifies a list of query parameter match criteria, all of which must match
         * corresponding query parameters in the request.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder queryParameterMatches(@Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>> queryParameterMatches) {
            $.queryParameterMatches = queryParameterMatches;
            return this;
        }

        /**
         * @param queryParameterMatches Specifies a list of query parameter match criteria, all of which must match
         * corresponding query parameters in the request.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder queryParameterMatches(List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs> queryParameterMatches) {
            return queryParameterMatches(Output.of(queryParameterMatches));
        }

        /**
         * @param queryParameterMatches Specifies a list of query parameter match criteria, all of which must match
         * corresponding query parameters in the request.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder queryParameterMatches(RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs... queryParameterMatches) {
            return queryParameterMatches(List.of(queryParameterMatches));
        }

        /**
         * @param regexMatch The queryParameterMatch matches if the value of the parameter matches the
         * regular expression specified by regexMatch. For the regular expression grammar,
         * please see en.cppreference.com/w/cpp/regex/ecmascript  Only one of presentMatch,
         * exactMatch and regexMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder regexMatch(@Nullable Output<String> regexMatch) {
            $.regexMatch = regexMatch;
            return this;
        }

        /**
         * @param regexMatch The queryParameterMatch matches if the value of the parameter matches the
         * regular expression specified by regexMatch. For the regular expression grammar,
         * please see en.cppreference.com/w/cpp/regex/ecmascript  Only one of presentMatch,
         * exactMatch and regexMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder regexMatch(String regexMatch) {
            return regexMatch(Output.of(regexMatch));
        }

        public RegionUrlMapPathMatcherRouteRuleMatchRuleArgs build() {
            return $;
        }
    }

}
