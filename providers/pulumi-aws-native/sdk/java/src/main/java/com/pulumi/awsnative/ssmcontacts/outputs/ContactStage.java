// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmcontacts.outputs;

import com.pulumi.awsnative.ssmcontacts.outputs.ContactTargets;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ContactStage {
    /**
     * @return The time to wait until beginning the next stage.
     * 
     */
    private final Integer durationInMinutes;
    /**
     * @return The contacts or contact methods that the escalation plan or engagement plan is engaging.
     * 
     */
    private final @Nullable List<ContactTargets> targets;

    @CustomType.Constructor
    private ContactStage(
        @CustomType.Parameter("durationInMinutes") Integer durationInMinutes,
        @CustomType.Parameter("targets") @Nullable List<ContactTargets> targets) {
        this.durationInMinutes = durationInMinutes;
        this.targets = targets;
    }

    /**
     * @return The time to wait until beginning the next stage.
     * 
     */
    public Integer durationInMinutes() {
        return this.durationInMinutes;
    }
    /**
     * @return The contacts or contact methods that the escalation plan or engagement plan is engaging.
     * 
     */
    public List<ContactTargets> targets() {
        return this.targets == null ? List.of() : this.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactStage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer durationInMinutes;
        private @Nullable List<ContactTargets> targets;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactStage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationInMinutes = defaults.durationInMinutes;
    	      this.targets = defaults.targets;
        }

        public Builder durationInMinutes(Integer durationInMinutes) {
            this.durationInMinutes = Objects.requireNonNull(durationInMinutes);
            return this;
        }
        public Builder targets(@Nullable List<ContactTargets> targets) {
            this.targets = targets;
            return this;
        }
        public Builder targets(ContactTargets... targets) {
            return targets(List.of(targets));
        }        public ContactStage build() {
            return new ContactStage(durationInMinutes, targets);
        }
    }
}
