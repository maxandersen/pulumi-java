// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class RouteSpecHttpRouteMatchHeaderMatchRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteMatchHeaderMatchRangeArgs Empty = new RouteSpecHttpRouteMatchHeaderMatchRangeArgs();

    /**
     * The end of the range.
     * 
     */
    @Import(name="end", required=true)
    private Output<Integer> end;

    public Output<Integer> end() {
        return this.end;
    }

    /**
     * The start of the range.
     * 
     */
    @Import(name="start", required=true)
    private Output<Integer> start;

    public Output<Integer> start() {
        return this.start;
    }

    private RouteSpecHttpRouteMatchHeaderMatchRangeArgs() {}

    private RouteSpecHttpRouteMatchHeaderMatchRangeArgs(RouteSpecHttpRouteMatchHeaderMatchRangeArgs $) {
        this.end = $.end;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecHttpRouteMatchHeaderMatchRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecHttpRouteMatchHeaderMatchRangeArgs $;

        public Builder() {
            $ = new RouteSpecHttpRouteMatchHeaderMatchRangeArgs();
        }

        public Builder(RouteSpecHttpRouteMatchHeaderMatchRangeArgs defaults) {
            $ = new RouteSpecHttpRouteMatchHeaderMatchRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder end(Output<Integer> end) {
            $.end = end;
            return this;
        }

        public Builder end(Integer end) {
            return end(Output.of(end));
        }

        public Builder start(Output<Integer> start) {
            $.start = start;
            return this;
        }

        public Builder start(Integer start) {
            return start(Output.of(start));
        }

        public RouteSpecHttpRouteMatchHeaderMatchRangeArgs build() {
            $.end = Objects.requireNonNull($.end, "expected parameter 'end' to be non-null");
            $.start = Objects.requireNonNull($.start, "expected parameter 'start' to be non-null");
            return $;
        }
    }

}
