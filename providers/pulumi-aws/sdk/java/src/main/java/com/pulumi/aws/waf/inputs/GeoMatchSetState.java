// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.inputs;

import com.pulumi.aws.waf.inputs.GeoMatchSetGeoMatchConstraintGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GeoMatchSetState extends com.pulumi.resources.ResourceArgs {

    public static final GeoMatchSetState Empty = new GeoMatchSetState();

    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The GeoMatchConstraint objects which contain the country that you want AWS WAF to search for.
     * 
     */
    @Import(name="geoMatchConstraints")
      private final @Nullable Output<List<GeoMatchSetGeoMatchConstraintGetArgs>> geoMatchConstraints;

    public Output<List<GeoMatchSetGeoMatchConstraintGetArgs>> geoMatchConstraints() {
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

    public GeoMatchSetState(
        @Nullable Output<String> arn,
        @Nullable Output<List<GeoMatchSetGeoMatchConstraintGetArgs>> geoMatchConstraints,
        @Nullable Output<String> name) {
        this.arn = arn;
        this.geoMatchConstraints = geoMatchConstraints;
        this.name = name;
    }

    private GeoMatchSetState() {
        this.arn = Codegen.empty();
        this.geoMatchConstraints = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GeoMatchSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<List<GeoMatchSetGeoMatchConstraintGetArgs>> geoMatchConstraints;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GeoMatchSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.geoMatchConstraints = defaults.geoMatchConstraints;
    	      this.name = defaults.name;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder geoMatchConstraints(@Nullable Output<List<GeoMatchSetGeoMatchConstraintGetArgs>> geoMatchConstraints) {
            this.geoMatchConstraints = geoMatchConstraints;
            return this;
        }
        public Builder geoMatchConstraints(@Nullable List<GeoMatchSetGeoMatchConstraintGetArgs> geoMatchConstraints) {
            this.geoMatchConstraints = Codegen.ofNullable(geoMatchConstraints);
            return this;
        }
        public Builder geoMatchConstraints(GeoMatchSetGeoMatchConstraintGetArgs... geoMatchConstraints) {
            return geoMatchConstraints(List.of(geoMatchConstraints));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public GeoMatchSetState build() {
            return new GeoMatchSetState(arn, geoMatchConstraints, name);
        }
    }
}
