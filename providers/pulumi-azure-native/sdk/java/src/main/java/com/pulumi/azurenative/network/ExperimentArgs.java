// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.enums.State;
import com.pulumi.azurenative.network.inputs.ExperimentEndpointArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExperimentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExperimentArgs Empty = new ExperimentArgs();

    /**
     * The description of the details or intents of the Experiment
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The state of the Experiment
     * 
     */
    @Import(name="enabledState")
    private @Nullable Output<Either<String,State>> enabledState;

    public Optional<Output<Either<String,State>>> enabledState() {
        return Optional.ofNullable(this.enabledState);
    }

    /**
     * The endpoint A of an experiment
     * 
     */
    @Import(name="endpointA")
    private @Nullable Output<ExperimentEndpointArgs> endpointA;

    public Optional<Output<ExperimentEndpointArgs>> endpointA() {
        return Optional.ofNullable(this.endpointA);
    }

    /**
     * The endpoint B of an experiment
     * 
     */
    @Import(name="endpointB")
    private @Nullable Output<ExperimentEndpointArgs> endpointB;

    public Optional<Output<ExperimentEndpointArgs>> endpointB() {
        return Optional.ofNullable(this.endpointB);
    }

    /**
     * The Experiment identifier associated with the Experiment
     * 
     */
    @Import(name="experimentName")
    private @Nullable Output<String> experimentName;

    public Optional<Output<String>> experimentName() {
        return Optional.ofNullable(this.experimentName);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The Profile identifier associated with the Tenant and Partner
     * 
     */
    @Import(name="profileName", required=true)
    private Output<String> profileName;

    public Output<String> profileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ExperimentArgs() {}

    private ExperimentArgs(ExperimentArgs $) {
        this.description = $.description;
        this.enabledState = $.enabledState;
        this.endpointA = $.endpointA;
        this.endpointB = $.endpointB;
        this.experimentName = $.experimentName;
        this.location = $.location;
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExperimentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExperimentArgs $;

        public Builder() {
            $ = new ExperimentArgs();
        }

        public Builder(ExperimentArgs defaults) {
            $ = new ExperimentArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder enabledState(@Nullable Output<Either<String,State>> enabledState) {
            $.enabledState = enabledState;
            return this;
        }

        public Builder enabledState(Either<String,State> enabledState) {
            return enabledState(Output.of(enabledState));
        }

        public Builder endpointA(@Nullable Output<ExperimentEndpointArgs> endpointA) {
            $.endpointA = endpointA;
            return this;
        }

        public Builder endpointA(ExperimentEndpointArgs endpointA) {
            return endpointA(Output.of(endpointA));
        }

        public Builder endpointB(@Nullable Output<ExperimentEndpointArgs> endpointB) {
            $.endpointB = endpointB;
            return this;
        }

        public Builder endpointB(ExperimentEndpointArgs endpointB) {
            return endpointB(Output.of(endpointB));
        }

        public Builder experimentName(@Nullable Output<String> experimentName) {
            $.experimentName = experimentName;
            return this;
        }

        public Builder experimentName(String experimentName) {
            return experimentName(Output.of(experimentName));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder profileName(Output<String> profileName) {
            $.profileName = profileName;
            return this;
        }

        public Builder profileName(String profileName) {
            return profileName(Output.of(profileName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ExperimentArgs build() {
            $.profileName = Objects.requireNonNull($.profileName, "expected parameter 'profileName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
