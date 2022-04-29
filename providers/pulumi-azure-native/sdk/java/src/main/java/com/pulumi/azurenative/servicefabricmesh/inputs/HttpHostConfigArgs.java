// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.azurenative.servicefabricmesh.inputs.HttpRouteConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes the hostname properties for http routing.
 * 
 */
public final class HttpHostConfigArgs extends ResourceArgs {

    public static final HttpHostConfigArgs Empty = new HttpHostConfigArgs();

    /**
     * http hostname config name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return http hostname config name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Route information to use for routing. Routes are processed in the order they are specified. Specify routes that are more specific before routes that can handle general cases.
     * 
     */
    @Import(name="routes", required=true)
    private Output<List<HttpRouteConfigArgs>> routes;

    /**
     * @return Route information to use for routing. Routes are processed in the order they are specified. Specify routes that are more specific before routes that can handle general cases.
     * 
     */
    public Output<List<HttpRouteConfigArgs>> routes() {
        return this.routes;
    }

    private HttpHostConfigArgs() {}

    private HttpHostConfigArgs(HttpHostConfigArgs $) {
        this.name = $.name;
        this.routes = $.routes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpHostConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpHostConfigArgs $;

        public Builder() {
            $ = new HttpHostConfigArgs();
        }

        public Builder(HttpHostConfigArgs defaults) {
            $ = new HttpHostConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name http hostname config name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name http hostname config name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param routes Route information to use for routing. Routes are processed in the order they are specified. Specify routes that are more specific before routes that can handle general cases.
         * 
         * @return builder
         * 
         */
        public Builder routes(Output<List<HttpRouteConfigArgs>> routes) {
            $.routes = routes;
            return this;
        }

        /**
         * @param routes Route information to use for routing. Routes are processed in the order they are specified. Specify routes that are more specific before routes that can handle general cases.
         * 
         * @return builder
         * 
         */
        public Builder routes(List<HttpRouteConfigArgs> routes) {
            return routes(Output.of(routes));
        }

        /**
         * @param routes Route information to use for routing. Routes are processed in the order they are specified. Specify routes that are more specific before routes that can handle general cases.
         * 
         * @return builder
         * 
         */
        public Builder routes(HttpRouteConfigArgs... routes) {
            return routes(List.of(routes));
        }

        public HttpHostConfigArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.routes = Objects.requireNonNull($.routes, "expected parameter 'routes' to be non-null");
            return $;
        }
    }

}
