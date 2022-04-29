// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.AssignedUserArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for a personal compute instance.
 * 
 */
public final class PersonalComputeInstanceSettingsArgs extends ResourceArgs {

    public static final PersonalComputeInstanceSettingsArgs Empty = new PersonalComputeInstanceSettingsArgs();

    /**
     * A user explicitly assigned to a personal compute instance.
     * 
     */
    @Import(name="assignedUser")
    private @Nullable Output<AssignedUserArgs> assignedUser;

    /**
     * @return A user explicitly assigned to a personal compute instance.
     * 
     */
    public Optional<Output<AssignedUserArgs>> assignedUser() {
        return Optional.ofNullable(this.assignedUser);
    }

    private PersonalComputeInstanceSettingsArgs() {}

    private PersonalComputeInstanceSettingsArgs(PersonalComputeInstanceSettingsArgs $) {
        this.assignedUser = $.assignedUser;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PersonalComputeInstanceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PersonalComputeInstanceSettingsArgs $;

        public Builder() {
            $ = new PersonalComputeInstanceSettingsArgs();
        }

        public Builder(PersonalComputeInstanceSettingsArgs defaults) {
            $ = new PersonalComputeInstanceSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignedUser A user explicitly assigned to a personal compute instance.
         * 
         * @return builder
         * 
         */
        public Builder assignedUser(@Nullable Output<AssignedUserArgs> assignedUser) {
            $.assignedUser = assignedUser;
            return this;
        }

        /**
         * @param assignedUser A user explicitly assigned to a personal compute instance.
         * 
         * @return builder
         * 
         */
        public Builder assignedUser(AssignedUserArgs assignedUser) {
            return assignedUser(Output.of(assignedUser));
        }

        public PersonalComputeInstanceSettingsArgs build() {
            return $;
        }
    }

}
