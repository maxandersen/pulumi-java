// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Metadata pertaining to the geographic location of the resource.
 * 
 */
public final class LocationDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationDataArgs Empty = new LocationDataArgs();

    /**
     * The city or locality where the resource is located.
     * 
     */
    @Import(name="city")
      private final @Nullable Output<String> city;

    public Output<String> city() {
        return this.city == null ? Codegen.empty() : this.city;
    }

    /**
     * The country or region where the resource is located
     * 
     */
    @Import(name="countryOrRegion")
      private final @Nullable Output<String> countryOrRegion;

    public Output<String> countryOrRegion() {
        return this.countryOrRegion == null ? Codegen.empty() : this.countryOrRegion;
    }

    /**
     * The district, state, or province where the resource is located.
     * 
     */
    @Import(name="district")
      private final @Nullable Output<String> district;

    public Output<String> district() {
        return this.district == null ? Codegen.empty() : this.district;
    }

    /**
     * A canonical name for the geographic or physical location.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    public LocationDataArgs(
        @Nullable Output<String> city,
        @Nullable Output<String> countryOrRegion,
        @Nullable Output<String> district,
        Output<String> name) {
        this.city = city;
        this.countryOrRegion = countryOrRegion;
        this.district = district;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private LocationDataArgs() {
        this.city = Codegen.empty();
        this.countryOrRegion = Codegen.empty();
        this.district = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> city;
        private @Nullable Output<String> countryOrRegion;
        private @Nullable Output<String> district;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.city = defaults.city;
    	      this.countryOrRegion = defaults.countryOrRegion;
    	      this.district = defaults.district;
    	      this.name = defaults.name;
        }

        public Builder city(@Nullable Output<String> city) {
            this.city = city;
            return this;
        }
        public Builder city(@Nullable String city) {
            this.city = Codegen.ofNullable(city);
            return this;
        }
        public Builder countryOrRegion(@Nullable Output<String> countryOrRegion) {
            this.countryOrRegion = countryOrRegion;
            return this;
        }
        public Builder countryOrRegion(@Nullable String countryOrRegion) {
            this.countryOrRegion = Codegen.ofNullable(countryOrRegion);
            return this;
        }
        public Builder district(@Nullable Output<String> district) {
            this.district = district;
            return this;
        }
        public Builder district(@Nullable String district) {
            this.district = Codegen.ofNullable(district);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public LocationDataArgs build() {
            return new LocationDataArgs(city, countryOrRegion, district, name);
        }
    }
}
