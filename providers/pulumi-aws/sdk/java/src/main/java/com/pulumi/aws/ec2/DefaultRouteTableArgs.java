// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.ec2.inputs.DefaultRouteTableRouteArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultRouteTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefaultRouteTableArgs Empty = new DefaultRouteTableArgs();

    /**
     * ID of the default route table.
     * 
     */
    @Import(name="defaultRouteTableId", required=true)
    private Output<String> defaultRouteTableId;

    public Output<String> defaultRouteTableId() {
        return this.defaultRouteTableId;
    }

    /**
     * List of virtual gateways for propagation.
     * 
     */
    @Import(name="propagatingVgws")
    private @Nullable Output<List<String>> propagatingVgws;

    public Optional<Output<List<String>>> propagatingVgws() {
        return Optional.ofNullable(this.propagatingVgws);
    }

    /**
     * Set of objects. Detailed below
     * 
     */
    @Import(name="routes")
    private @Nullable Output<List<DefaultRouteTableRouteArgs>> routes;

    public Optional<Output<List<DefaultRouteTableRouteArgs>>> routes() {
        return Optional.ofNullable(this.routes);
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DefaultRouteTableArgs() {}

    private DefaultRouteTableArgs(DefaultRouteTableArgs $) {
        this.defaultRouteTableId = $.defaultRouteTableId;
        this.propagatingVgws = $.propagatingVgws;
        this.routes = $.routes;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultRouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultRouteTableArgs $;

        public Builder() {
            $ = new DefaultRouteTableArgs();
        }

        public Builder(DefaultRouteTableArgs defaults) {
            $ = new DefaultRouteTableArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultRouteTableId(Output<String> defaultRouteTableId) {
            $.defaultRouteTableId = defaultRouteTableId;
            return this;
        }

        public Builder defaultRouteTableId(String defaultRouteTableId) {
            return defaultRouteTableId(Output.of(defaultRouteTableId));
        }

        public Builder propagatingVgws(@Nullable Output<List<String>> propagatingVgws) {
            $.propagatingVgws = propagatingVgws;
            return this;
        }

        public Builder propagatingVgws(List<String> propagatingVgws) {
            return propagatingVgws(Output.of(propagatingVgws));
        }

        public Builder propagatingVgws(String... propagatingVgws) {
            return propagatingVgws(List.of(propagatingVgws));
        }

        public Builder routes(@Nullable Output<List<DefaultRouteTableRouteArgs>> routes) {
            $.routes = routes;
            return this;
        }

        public Builder routes(List<DefaultRouteTableRouteArgs> routes) {
            return routes(Output.of(routes));
        }

        public Builder routes(DefaultRouteTableRouteArgs... routes) {
            return routes(List.of(routes));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DefaultRouteTableArgs build() {
            $.defaultRouteTableId = Objects.requireNonNull($.defaultRouteTableId, "expected parameter 'defaultRouteTableId' to be non-null");
            return $;
        }
    }

}
