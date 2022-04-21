// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThingGroupMembershipArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThingGroupMembershipArgs Empty = new ThingGroupMembershipArgs();

    /**
     * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
     * 
     */
    @Import(name="overrideDynamicGroup")
    private @Nullable Output<Boolean> overrideDynamicGroup;

    public Optional<Output<Boolean>> overrideDynamicGroup() {
        return Optional.ofNullable(this.overrideDynamicGroup);
    }

    /**
     * The name of the group to which you are adding a thing.
     * 
     */
    @Import(name="thingGroupName", required=true)
    private Output<String> thingGroupName;

    public Output<String> thingGroupName() {
        return this.thingGroupName;
    }

    /**
     * The name of the thing to add to a group.
     * 
     */
    @Import(name="thingName", required=true)
    private Output<String> thingName;

    public Output<String> thingName() {
        return this.thingName;
    }

    private ThingGroupMembershipArgs() {}

    private ThingGroupMembershipArgs(ThingGroupMembershipArgs $) {
        this.overrideDynamicGroup = $.overrideDynamicGroup;
        this.thingGroupName = $.thingGroupName;
        this.thingName = $.thingName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThingGroupMembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThingGroupMembershipArgs $;

        public Builder() {
            $ = new ThingGroupMembershipArgs();
        }

        public Builder(ThingGroupMembershipArgs defaults) {
            $ = new ThingGroupMembershipArgs(Objects.requireNonNull(defaults));
        }

        public Builder overrideDynamicGroup(@Nullable Output<Boolean> overrideDynamicGroup) {
            $.overrideDynamicGroup = overrideDynamicGroup;
            return this;
        }

        public Builder overrideDynamicGroup(Boolean overrideDynamicGroup) {
            return overrideDynamicGroup(Output.of(overrideDynamicGroup));
        }

        public Builder thingGroupName(Output<String> thingGroupName) {
            $.thingGroupName = thingGroupName;
            return this;
        }

        public Builder thingGroupName(String thingGroupName) {
            return thingGroupName(Output.of(thingGroupName));
        }

        public Builder thingName(Output<String> thingName) {
            $.thingName = thingName;
            return this;
        }

        public Builder thingName(String thingName) {
            return thingName(Output.of(thingName));
        }

        public ThingGroupMembershipArgs build() {
            $.thingGroupName = Objects.requireNonNull($.thingGroupName, "expected parameter 'thingGroupName' to be non-null");
            $.thingName = Objects.requireNonNull($.thingName, "expected parameter 'thingName' to be non-null");
            return $;
        }
    }

}
