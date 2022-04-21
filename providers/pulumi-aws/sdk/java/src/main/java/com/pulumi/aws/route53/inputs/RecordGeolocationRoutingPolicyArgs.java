// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecordGeolocationRoutingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecordGeolocationRoutingPolicyArgs Empty = new RecordGeolocationRoutingPolicyArgs();

    /**
     * A two-letter continent code. See http://docs.aws.amazon.com/Route53/latest/APIReference/API_GetGeoLocation.html for code details. Either `continent` or `country` must be specified.
     * 
     */
    @Import(name="continent")
    private @Nullable Output<String> continent;

    public Optional<Output<String>> continent() {
        return Optional.ofNullable(this.continent);
    }

    /**
     * A two-character country code or `*` to indicate a default resource record set.
     * 
     */
    @Import(name="country")
    private @Nullable Output<String> country;

    public Optional<Output<String>> country() {
        return Optional.ofNullable(this.country);
    }

    /**
     * A subdivision code for a country.
     * 
     */
    @Import(name="subdivision")
    private @Nullable Output<String> subdivision;

    public Optional<Output<String>> subdivision() {
        return Optional.ofNullable(this.subdivision);
    }

    private RecordGeolocationRoutingPolicyArgs() {}

    private RecordGeolocationRoutingPolicyArgs(RecordGeolocationRoutingPolicyArgs $) {
        this.continent = $.continent;
        this.country = $.country;
        this.subdivision = $.subdivision;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecordGeolocationRoutingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordGeolocationRoutingPolicyArgs $;

        public Builder() {
            $ = new RecordGeolocationRoutingPolicyArgs();
        }

        public Builder(RecordGeolocationRoutingPolicyArgs defaults) {
            $ = new RecordGeolocationRoutingPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder continent(@Nullable Output<String> continent) {
            $.continent = continent;
            return this;
        }

        public Builder continent(String continent) {
            return continent(Output.of(continent));
        }

        public Builder country(@Nullable Output<String> country) {
            $.country = country;
            return this;
        }

        public Builder country(String country) {
            return country(Output.of(country));
        }

        public Builder subdivision(@Nullable Output<String> subdivision) {
            $.subdivision = subdivision;
            return this;
        }

        public Builder subdivision(String subdivision) {
            return subdivision(Output.of(subdivision));
        }

        public RecordGeolocationRoutingPolicyArgs build() {
            return $;
        }
    }

}
