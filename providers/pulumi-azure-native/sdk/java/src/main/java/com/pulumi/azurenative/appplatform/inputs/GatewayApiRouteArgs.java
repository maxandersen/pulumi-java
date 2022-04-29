// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * API route config of the Spring Cloud Gateway
 * 
 */
public final class GatewayApiRouteArgs extends ResourceArgs {

    public static final GatewayApiRouteArgs Empty = new GatewayApiRouteArgs();

    /**
     * A description, will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description, will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * To modify the request before sending it to the target endpoint, or the received response.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<String>> filters;

    /**
     * @return To modify the request before sending it to the target endpoint, or the received response.
     * 
     */
    public Optional<Output<List<String>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Route processing order.
     * 
     */
    @Import(name="order")
    private @Nullable Output<Integer> order;

    /**
     * @return Route processing order.
     * 
     */
    public Optional<Output<Integer>> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * A number of conditions to evaluate a route for each request. Each predicate may be evaluated against request headers and parameter values. All of the predicates associated with a route must evaluate to true for the route to be matched to the request.
     * 
     */
    @Import(name="predicates")
    private @Nullable Output<List<String>> predicates;

    /**
     * @return A number of conditions to evaluate a route for each request. Each predicate may be evaluated against request headers and parameter values. All of the predicates associated with a route must evaluate to true for the route to be matched to the request.
     * 
     */
    public Optional<Output<List<String>>> predicates() {
        return Optional.ofNullable(this.predicates);
    }

    /**
     * Enable sso validation.
     * 
     */
    @Import(name="ssoEnabled")
    private @Nullable Output<Boolean> ssoEnabled;

    /**
     * @return Enable sso validation.
     * 
     */
    public Optional<Output<Boolean>> ssoEnabled() {
        return Optional.ofNullable(this.ssoEnabled);
    }

    /**
     * Classification tags, will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Classification tags, will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A title, will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return A title, will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * Pass currently-authenticated user&#39;s identity token to application service, default is &#39;false&#39;
     * 
     */
    @Import(name="tokenRelay")
    private @Nullable Output<Boolean> tokenRelay;

    /**
     * @return Pass currently-authenticated user&#39;s identity token to application service, default is &#39;false&#39;
     * 
     */
    public Optional<Output<Boolean>> tokenRelay() {
        return Optional.ofNullable(this.tokenRelay);
    }

    /**
     * Full uri, will override `appName`.
     * 
     */
    @Import(name="uri")
    private @Nullable Output<String> uri;

    /**
     * @return Full uri, will override `appName`.
     * 
     */
    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    private GatewayApiRouteArgs() {}

    private GatewayApiRouteArgs(GatewayApiRouteArgs $) {
        this.description = $.description;
        this.filters = $.filters;
        this.order = $.order;
        this.predicates = $.predicates;
        this.ssoEnabled = $.ssoEnabled;
        this.tags = $.tags;
        this.title = $.title;
        this.tokenRelay = $.tokenRelay;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayApiRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayApiRouteArgs $;

        public Builder() {
            $ = new GatewayApiRouteArgs();
        }

        public Builder(GatewayApiRouteArgs defaults) {
            $ = new GatewayApiRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description, will be applied to methods in the generated OpenAPI documentation.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description, will be applied to methods in the generated OpenAPI documentation.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param filters To modify the request before sending it to the target endpoint, or the received response.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<String>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters To modify the request before sending it to the target endpoint, or the received response.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<String> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters To modify the request before sending it to the target endpoint, or the received response.
         * 
         * @return builder
         * 
         */
        public Builder filters(String... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param order Route processing order.
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<Integer> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Route processing order.
         * 
         * @return builder
         * 
         */
        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        /**
         * @param predicates A number of conditions to evaluate a route for each request. Each predicate may be evaluated against request headers and parameter values. All of the predicates associated with a route must evaluate to true for the route to be matched to the request.
         * 
         * @return builder
         * 
         */
        public Builder predicates(@Nullable Output<List<String>> predicates) {
            $.predicates = predicates;
            return this;
        }

        /**
         * @param predicates A number of conditions to evaluate a route for each request. Each predicate may be evaluated against request headers and parameter values. All of the predicates associated with a route must evaluate to true for the route to be matched to the request.
         * 
         * @return builder
         * 
         */
        public Builder predicates(List<String> predicates) {
            return predicates(Output.of(predicates));
        }

        /**
         * @param predicates A number of conditions to evaluate a route for each request. Each predicate may be evaluated against request headers and parameter values. All of the predicates associated with a route must evaluate to true for the route to be matched to the request.
         * 
         * @return builder
         * 
         */
        public Builder predicates(String... predicates) {
            return predicates(List.of(predicates));
        }

        /**
         * @param ssoEnabled Enable sso validation.
         * 
         * @return builder
         * 
         */
        public Builder ssoEnabled(@Nullable Output<Boolean> ssoEnabled) {
            $.ssoEnabled = ssoEnabled;
            return this;
        }

        /**
         * @param ssoEnabled Enable sso validation.
         * 
         * @return builder
         * 
         */
        public Builder ssoEnabled(Boolean ssoEnabled) {
            return ssoEnabled(Output.of(ssoEnabled));
        }

        /**
         * @param tags Classification tags, will be applied to methods in the generated OpenAPI documentation.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Classification tags, will be applied to methods in the generated OpenAPI documentation.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Classification tags, will be applied to methods in the generated OpenAPI documentation.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param title A title, will be applied to methods in the generated OpenAPI documentation.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title A title, will be applied to methods in the generated OpenAPI documentation.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param tokenRelay Pass currently-authenticated user&#39;s identity token to application service, default is &#39;false&#39;
         * 
         * @return builder
         * 
         */
        public Builder tokenRelay(@Nullable Output<Boolean> tokenRelay) {
            $.tokenRelay = tokenRelay;
            return this;
        }

        /**
         * @param tokenRelay Pass currently-authenticated user&#39;s identity token to application service, default is &#39;false&#39;
         * 
         * @return builder
         * 
         */
        public Builder tokenRelay(Boolean tokenRelay) {
            return tokenRelay(Output.of(tokenRelay));
        }

        /**
         * @param uri Full uri, will override `appName`.
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri Full uri, will override `appName`.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public GatewayApiRouteArgs build() {
            return $;
        }
    }

}
