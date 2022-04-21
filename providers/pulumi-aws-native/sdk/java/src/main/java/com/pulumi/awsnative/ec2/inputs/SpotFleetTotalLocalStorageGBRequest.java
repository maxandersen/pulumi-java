// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetTotalLocalStorageGBRequest extends com.pulumi.resources.InvokeArgs {

    public static final SpotFleetTotalLocalStorageGBRequest Empty = new SpotFleetTotalLocalStorageGBRequest();

    @Import(name="max")
    private @Nullable Double max;

    public Optional<Double> max() {
        return Optional.ofNullable(this.max);
    }

    @Import(name="min")
    private @Nullable Double min;

    public Optional<Double> min() {
        return Optional.ofNullable(this.min);
    }

    private SpotFleetTotalLocalStorageGBRequest() {}

    private SpotFleetTotalLocalStorageGBRequest(SpotFleetTotalLocalStorageGBRequest $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetTotalLocalStorageGBRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetTotalLocalStorageGBRequest $;

        public Builder() {
            $ = new SpotFleetTotalLocalStorageGBRequest();
        }

        public Builder(SpotFleetTotalLocalStorageGBRequest defaults) {
            $ = new SpotFleetTotalLocalStorageGBRequest(Objects.requireNonNull(defaults));
        }

        public Builder max(@Nullable Double max) {
            $.max = max;
            return this;
        }

        public Builder min(@Nullable Double min) {
            $.min = min;
            return this;
        }

        public SpotFleetTotalLocalStorageGBRequest build() {
            return $;
        }
    }

}
