// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RouteAsPathResponse {
    /**
     * The AS numbers of the AS Path.
     * 
     */
    private final List<Integer> asLists;
    /**
     * The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
     * 
     */
    private final String pathSegmentType;

    @OutputCustomType.Constructor
    private RouteAsPathResponse(
        @OutputCustomType.Parameter("asLists") List<Integer> asLists,
        @OutputCustomType.Parameter("pathSegmentType") String pathSegmentType) {
        this.asLists = asLists;
        this.pathSegmentType = pathSegmentType;
    }

    /**
     * The AS numbers of the AS Path.
     * 
    */
    public List<Integer> getAsLists() {
        return this.asLists;
    }
    /**
     * The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
     * 
    */
    public String getPathSegmentType() {
        return this.pathSegmentType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteAsPathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> asLists;
        private String pathSegmentType;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteAsPathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asLists = defaults.asLists;
    	      this.pathSegmentType = defaults.pathSegmentType;
        }

        public Builder setAsLists(List<Integer> asLists) {
            this.asLists = Objects.requireNonNull(asLists);
            return this;
        }

        public Builder setPathSegmentType(String pathSegmentType) {
            this.pathSegmentType = Objects.requireNonNull(pathSegmentType);
            return this;
        }
        public RouteAsPathResponse build() {
            return new RouteAsPathResponse(asLists, pathSegmentType);
        }
    }
}
