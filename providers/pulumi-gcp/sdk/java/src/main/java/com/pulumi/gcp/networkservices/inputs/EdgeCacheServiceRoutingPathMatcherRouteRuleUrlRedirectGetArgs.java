// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs();

    /**
     * The host that will be used in the redirect response instead of the one that was supplied in the request.
     * 
     */
    @Import(name="hostRedirect")
    private @Nullable Output<String> hostRedirect;

    public Optional<Output<String>> hostRedirect() {
        return Optional.ofNullable(this.hostRedirect);
    }

    /**
     * If set to true, the URL scheme in the redirected request is set to https. If set to false, the URL scheme of the redirected request will remain the same as that of the request.
     * This can only be set if there is at least one (1) edgeSslCertificate set on the service.
     * 
     */
    @Import(name="httpsRedirect")
    private @Nullable Output<Boolean> httpsRedirect;

    public Optional<Output<Boolean>> httpsRedirect() {
        return Optional.ofNullable(this.httpsRedirect);
    }

    /**
     * The path that will be used in the redirect response instead of the one that was supplied in the request.
     * pathRedirect cannot be supplied together with prefixRedirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
     * The path value must be between 1 and 1024 characters.
     * 
     */
    @Import(name="pathRedirect")
    private @Nullable Output<String> pathRedirect;

    public Optional<Output<String>> pathRedirect() {
        return Optional.ofNullable(this.pathRedirect);
    }

    /**
     * The prefix that replaces the prefixMatch specified in the routeRule, retaining the remaining portion of the URL before redirecting the request.
     * prefixRedirect cannot be supplied together with pathRedirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
     * 
     */
    @Import(name="prefixRedirect")
    private @Nullable Output<String> prefixRedirect;

    public Optional<Output<String>> prefixRedirect() {
        return Optional.ofNullable(this.prefixRedirect);
    }

    /**
     * The HTTP Status code to use for this RedirectAction.
     * The supported values are:
     * - `MOVED_PERMANENTLY_DEFAULT`, which is the default value and corresponds to 301.
     * - `FOUND`, which corresponds to 302.
     * 
     */
    @Import(name="redirectResponseCode")
    private @Nullable Output<String> redirectResponseCode;

    public Optional<Output<String>> redirectResponseCode() {
        return Optional.ofNullable(this.redirectResponseCode);
    }

    /**
     * If set to true, any accompanying query portion of the original URL is removed prior to redirecting the request. If set to false, the query portion of the original URL is retained.
     * 
     */
    @Import(name="stripQuery")
    private @Nullable Output<Boolean> stripQuery;

    public Optional<Output<Boolean>> stripQuery() {
        return Optional.ofNullable(this.stripQuery);
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs() {}

    private EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs(EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs $) {
        this.hostRedirect = $.hostRedirect;
        this.httpsRedirect = $.httpsRedirect;
        this.pathRedirect = $.pathRedirect;
        this.prefixRedirect = $.prefixRedirect;
        this.redirectResponseCode = $.redirectResponseCode;
        this.stripQuery = $.stripQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs $;

        public Builder() {
            $ = new EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs();
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs defaults) {
            $ = new EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder hostRedirect(@Nullable Output<String> hostRedirect) {
            $.hostRedirect = hostRedirect;
            return this;
        }

        public Builder hostRedirect(String hostRedirect) {
            return hostRedirect(Output.of(hostRedirect));
        }

        public Builder httpsRedirect(@Nullable Output<Boolean> httpsRedirect) {
            $.httpsRedirect = httpsRedirect;
            return this;
        }

        public Builder httpsRedirect(Boolean httpsRedirect) {
            return httpsRedirect(Output.of(httpsRedirect));
        }

        public Builder pathRedirect(@Nullable Output<String> pathRedirect) {
            $.pathRedirect = pathRedirect;
            return this;
        }

        public Builder pathRedirect(String pathRedirect) {
            return pathRedirect(Output.of(pathRedirect));
        }

        public Builder prefixRedirect(@Nullable Output<String> prefixRedirect) {
            $.prefixRedirect = prefixRedirect;
            return this;
        }

        public Builder prefixRedirect(String prefixRedirect) {
            return prefixRedirect(Output.of(prefixRedirect));
        }

        public Builder redirectResponseCode(@Nullable Output<String> redirectResponseCode) {
            $.redirectResponseCode = redirectResponseCode;
            return this;
        }

        public Builder redirectResponseCode(String redirectResponseCode) {
            return redirectResponseCode(Output.of(redirectResponseCode));
        }

        public Builder stripQuery(@Nullable Output<Boolean> stripQuery) {
            $.stripQuery = stripQuery;
            return this;
        }

        public Builder stripQuery(Boolean stripQuery) {
            return stripQuery(Output.of(stripQuery));
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs build() {
            return $;
        }
    }

}
