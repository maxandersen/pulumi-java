// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.inputs.DefaultRolloutSpecificationCanaryArgs;
import com.pulumi.azurenative.providerhub.inputs.DefaultRolloutSpecificationHighTrafficArgs;
import com.pulumi.azurenative.providerhub.inputs.DefaultRolloutSpecificationLowTrafficArgs;
import com.pulumi.azurenative.providerhub.inputs.DefaultRolloutSpecificationMediumTrafficArgs;
import com.pulumi.azurenative.providerhub.inputs.DefaultRolloutSpecificationProviderRegistrationArgs;
import com.pulumi.azurenative.providerhub.inputs.DefaultRolloutSpecificationRestOfTheWorldGroupOneArgs;
import com.pulumi.azurenative.providerhub.inputs.DefaultRolloutSpecificationRestOfTheWorldGroupTwoArgs;
import com.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultRolloutPropertiesSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefaultRolloutPropertiesSpecificationArgs Empty = new DefaultRolloutPropertiesSpecificationArgs();

    @Import(name="canary")
    private @Nullable Output<DefaultRolloutSpecificationCanaryArgs> canary;

    public Optional<Output<DefaultRolloutSpecificationCanaryArgs>> canary() {
        return Optional.ofNullable(this.canary);
    }

    @Import(name="highTraffic")
    private @Nullable Output<DefaultRolloutSpecificationHighTrafficArgs> highTraffic;

    public Optional<Output<DefaultRolloutSpecificationHighTrafficArgs>> highTraffic() {
        return Optional.ofNullable(this.highTraffic);
    }

    @Import(name="lowTraffic")
    private @Nullable Output<DefaultRolloutSpecificationLowTrafficArgs> lowTraffic;

    public Optional<Output<DefaultRolloutSpecificationLowTrafficArgs>> lowTraffic() {
        return Optional.ofNullable(this.lowTraffic);
    }

    @Import(name="mediumTraffic")
    private @Nullable Output<DefaultRolloutSpecificationMediumTrafficArgs> mediumTraffic;

    public Optional<Output<DefaultRolloutSpecificationMediumTrafficArgs>> mediumTraffic() {
        return Optional.ofNullable(this.mediumTraffic);
    }

    @Import(name="providerRegistration")
    private @Nullable Output<DefaultRolloutSpecificationProviderRegistrationArgs> providerRegistration;

    public Optional<Output<DefaultRolloutSpecificationProviderRegistrationArgs>> providerRegistration() {
        return Optional.ofNullable(this.providerRegistration);
    }

    @Import(name="resourceTypeRegistrations")
    private @Nullable Output<List<ResourceTypeRegistrationArgs>> resourceTypeRegistrations;

    public Optional<Output<List<ResourceTypeRegistrationArgs>>> resourceTypeRegistrations() {
        return Optional.ofNullable(this.resourceTypeRegistrations);
    }

    @Import(name="restOfTheWorldGroupOne")
    private @Nullable Output<DefaultRolloutSpecificationRestOfTheWorldGroupOneArgs> restOfTheWorldGroupOne;

    public Optional<Output<DefaultRolloutSpecificationRestOfTheWorldGroupOneArgs>> restOfTheWorldGroupOne() {
        return Optional.ofNullable(this.restOfTheWorldGroupOne);
    }

    @Import(name="restOfTheWorldGroupTwo")
    private @Nullable Output<DefaultRolloutSpecificationRestOfTheWorldGroupTwoArgs> restOfTheWorldGroupTwo;

    public Optional<Output<DefaultRolloutSpecificationRestOfTheWorldGroupTwoArgs>> restOfTheWorldGroupTwo() {
        return Optional.ofNullable(this.restOfTheWorldGroupTwo);
    }

    private DefaultRolloutPropertiesSpecificationArgs() {}

    private DefaultRolloutPropertiesSpecificationArgs(DefaultRolloutPropertiesSpecificationArgs $) {
        this.canary = $.canary;
        this.highTraffic = $.highTraffic;
        this.lowTraffic = $.lowTraffic;
        this.mediumTraffic = $.mediumTraffic;
        this.providerRegistration = $.providerRegistration;
        this.resourceTypeRegistrations = $.resourceTypeRegistrations;
        this.restOfTheWorldGroupOne = $.restOfTheWorldGroupOne;
        this.restOfTheWorldGroupTwo = $.restOfTheWorldGroupTwo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultRolloutPropertiesSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultRolloutPropertiesSpecificationArgs $;

        public Builder() {
            $ = new DefaultRolloutPropertiesSpecificationArgs();
        }

        public Builder(DefaultRolloutPropertiesSpecificationArgs defaults) {
            $ = new DefaultRolloutPropertiesSpecificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder canary(@Nullable Output<DefaultRolloutSpecificationCanaryArgs> canary) {
            $.canary = canary;
            return this;
        }

        public Builder canary(DefaultRolloutSpecificationCanaryArgs canary) {
            return canary(Output.of(canary));
        }

        public Builder highTraffic(@Nullable Output<DefaultRolloutSpecificationHighTrafficArgs> highTraffic) {
            $.highTraffic = highTraffic;
            return this;
        }

        public Builder highTraffic(DefaultRolloutSpecificationHighTrafficArgs highTraffic) {
            return highTraffic(Output.of(highTraffic));
        }

        public Builder lowTraffic(@Nullable Output<DefaultRolloutSpecificationLowTrafficArgs> lowTraffic) {
            $.lowTraffic = lowTraffic;
            return this;
        }

        public Builder lowTraffic(DefaultRolloutSpecificationLowTrafficArgs lowTraffic) {
            return lowTraffic(Output.of(lowTraffic));
        }

        public Builder mediumTraffic(@Nullable Output<DefaultRolloutSpecificationMediumTrafficArgs> mediumTraffic) {
            $.mediumTraffic = mediumTraffic;
            return this;
        }

        public Builder mediumTraffic(DefaultRolloutSpecificationMediumTrafficArgs mediumTraffic) {
            return mediumTraffic(Output.of(mediumTraffic));
        }

        public Builder providerRegistration(@Nullable Output<DefaultRolloutSpecificationProviderRegistrationArgs> providerRegistration) {
            $.providerRegistration = providerRegistration;
            return this;
        }

        public Builder providerRegistration(DefaultRolloutSpecificationProviderRegistrationArgs providerRegistration) {
            return providerRegistration(Output.of(providerRegistration));
        }

        public Builder resourceTypeRegistrations(@Nullable Output<List<ResourceTypeRegistrationArgs>> resourceTypeRegistrations) {
            $.resourceTypeRegistrations = resourceTypeRegistrations;
            return this;
        }

        public Builder resourceTypeRegistrations(List<ResourceTypeRegistrationArgs> resourceTypeRegistrations) {
            return resourceTypeRegistrations(Output.of(resourceTypeRegistrations));
        }

        public Builder resourceTypeRegistrations(ResourceTypeRegistrationArgs... resourceTypeRegistrations) {
            return resourceTypeRegistrations(List.of(resourceTypeRegistrations));
        }

        public Builder restOfTheWorldGroupOne(@Nullable Output<DefaultRolloutSpecificationRestOfTheWorldGroupOneArgs> restOfTheWorldGroupOne) {
            $.restOfTheWorldGroupOne = restOfTheWorldGroupOne;
            return this;
        }

        public Builder restOfTheWorldGroupOne(DefaultRolloutSpecificationRestOfTheWorldGroupOneArgs restOfTheWorldGroupOne) {
            return restOfTheWorldGroupOne(Output.of(restOfTheWorldGroupOne));
        }

        public Builder restOfTheWorldGroupTwo(@Nullable Output<DefaultRolloutSpecificationRestOfTheWorldGroupTwoArgs> restOfTheWorldGroupTwo) {
            $.restOfTheWorldGroupTwo = restOfTheWorldGroupTwo;
            return this;
        }

        public Builder restOfTheWorldGroupTwo(DefaultRolloutSpecificationRestOfTheWorldGroupTwoArgs restOfTheWorldGroupTwo) {
            return restOfTheWorldGroupTwo(Output.of(restOfTheWorldGroupTwo));
        }

        public DefaultRolloutPropertiesSpecificationArgs build() {
            return $;
        }
    }

}
