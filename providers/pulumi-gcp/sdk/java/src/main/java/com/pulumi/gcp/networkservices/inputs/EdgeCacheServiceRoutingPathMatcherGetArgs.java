// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherGetArgs Empty = new EdgeCacheServiceRoutingPathMatcherGetArgs();

    /**
     * A human-readable description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The routeRules to match against. routeRules support advanced routing behaviour, and can match on paths, headers and query parameters, as well as status codes and HTTP methods.
     * Structure is documented below.
     * 
     */
    @Import(name="routeRules", required=true)
    private Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs>> routeRules;

    public Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs>> routeRules() {
        return this.routeRules;
    }

    private EdgeCacheServiceRoutingPathMatcherGetArgs() {}

    private EdgeCacheServiceRoutingPathMatcherGetArgs(EdgeCacheServiceRoutingPathMatcherGetArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.routeRules = $.routeRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeCacheServiceRoutingPathMatcherGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeCacheServiceRoutingPathMatcherGetArgs $;

        public Builder() {
            $ = new EdgeCacheServiceRoutingPathMatcherGetArgs();
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherGetArgs defaults) {
            $ = new EdgeCacheServiceRoutingPathMatcherGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder routeRules(Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs>> routeRules) {
            $.routeRules = routeRules;
            return this;
        }

        public Builder routeRules(List<EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs> routeRules) {
            return routeRules(Output.of(routeRules));
        }

        public Builder routeRules(EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs... routeRules) {
            return routeRules(List.of(routeRules));
        }

        public EdgeCacheServiceRoutingPathMatcherGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.routeRules = Objects.requireNonNull($.routeRules, "expected parameter 'routeRules' to be non-null");
            return $;
        }
    }

}
