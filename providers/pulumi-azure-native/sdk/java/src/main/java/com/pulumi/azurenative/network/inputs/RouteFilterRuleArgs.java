// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.Access;
import com.pulumi.azurenative.network.enums.RouteFilterRuleType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Route Filter Rule Resource.
 * 
 */
public final class RouteFilterRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteFilterRuleArgs Empty = new RouteFilterRuleArgs();

    /**
     * The access type of the rule.
     * 
     */
    @Import(name="access", required=true)
    private Output<Either<String,Access>> access;

    public Output<Either<String,Access>> access() {
        return this.access;
    }

    /**
     * The collection for bgp community values to filter on. e.g. [&#39;12076:5010&#39;,&#39;12076:5020&#39;].
     * 
     */
    @Import(name="communities", required=true)
    private Output<List<String>> communities;

    public Output<List<String>> communities() {
        return this.communities;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The rule type of the rule.
     * 
     */
    @Import(name="routeFilterRuleType", required=true)
    private Output<Either<String,RouteFilterRuleType>> routeFilterRuleType;

    public Output<Either<String,RouteFilterRuleType>> routeFilterRuleType() {
        return this.routeFilterRuleType;
    }

    private RouteFilterRuleArgs() {}

    private RouteFilterRuleArgs(RouteFilterRuleArgs $) {
        this.access = $.access;
        this.communities = $.communities;
        this.id = $.id;
        this.location = $.location;
        this.name = $.name;
        this.routeFilterRuleType = $.routeFilterRuleType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteFilterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteFilterRuleArgs $;

        public Builder() {
            $ = new RouteFilterRuleArgs();
        }

        public Builder(RouteFilterRuleArgs defaults) {
            $ = new RouteFilterRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder access(Output<Either<String,Access>> access) {
            $.access = access;
            return this;
        }

        public Builder access(Either<String,Access> access) {
            return access(Output.of(access));
        }

        public Builder communities(Output<List<String>> communities) {
            $.communities = communities;
            return this;
        }

        public Builder communities(List<String> communities) {
            return communities(Output.of(communities));
        }

        public Builder communities(String... communities) {
            return communities(List.of(communities));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder routeFilterRuleType(Output<Either<String,RouteFilterRuleType>> routeFilterRuleType) {
            $.routeFilterRuleType = routeFilterRuleType;
            return this;
        }

        public Builder routeFilterRuleType(Either<String,RouteFilterRuleType> routeFilterRuleType) {
            return routeFilterRuleType(Output.of(routeFilterRuleType));
        }

        public RouteFilterRuleArgs build() {
            $.access = Objects.requireNonNull($.access, "expected parameter 'access' to be non-null");
            $.communities = Objects.requireNonNull($.communities, "expected parameter 'communities' to be non-null");
            $.routeFilterRuleType = Objects.requireNonNull($.routeFilterRuleType, "expected parameter 'routeFilterRuleType' to be non-null");
            return $;
        }
    }

}
