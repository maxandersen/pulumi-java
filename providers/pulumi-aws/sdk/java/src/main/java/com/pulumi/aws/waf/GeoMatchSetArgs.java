// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf;

import com.pulumi.aws.waf.inputs.GeoMatchSetGeoMatchConstraintArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GeoMatchSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GeoMatchSetArgs Empty = new GeoMatchSetArgs();

    /**
     * The GeoMatchConstraint objects which contain the country that you want AWS WAF to search for.
     * 
     */
    @Import(name="geoMatchConstraints")
      private final @Nullable Output<List<GeoMatchSetGeoMatchConstraintArgs>> geoMatchConstraints;

    public Output<List<GeoMatchSetGeoMatchConstraintArgs>> geoMatchConstraints() {
        return this.geoMatchConstraints == null ? Codegen.empty() : this.geoMatchConstraints;
    }

    /**
     * The name or description of the GeoMatchSet.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public GeoMatchSetArgs(
        @Nullable Output<List<GeoMatchSetGeoMatchConstraintArgs>> geoMatchConstraints,
        @Nullable Output<String> name) {
        this.geoMatchConstraints = geoMatchConstraints;
        this.name = name;
    }

    private GeoMatchSetArgs() {
        this.geoMatchConstraints = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GeoMatchSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GeoMatchSetGeoMatchConstraintArgs>> geoMatchConstraints;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GeoMatchSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.geoMatchConstraints = defaults.geoMatchConstraints;
    	      this.name = defaults.name;
        }

        public Builder geoMatchConstraints(@Nullable Output<List<GeoMatchSetGeoMatchConstraintArgs>> geoMatchConstraints) {
            this.geoMatchConstraints = geoMatchConstraints;
            return this;
        }
        public Builder geoMatchConstraints(@Nullable List<GeoMatchSetGeoMatchConstraintArgs> geoMatchConstraints) {
            this.geoMatchConstraints = Codegen.ofNullable(geoMatchConstraints);
            return this;
        }
        public Builder geoMatchConstraints(GeoMatchSetGeoMatchConstraintArgs... geoMatchConstraints) {
            return geoMatchConstraints(List.of(geoMatchConstraints));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public GeoMatchSetArgs build() {
            return new GeoMatchSetArgs(geoMatchConstraints, name);
        }
    }
}
