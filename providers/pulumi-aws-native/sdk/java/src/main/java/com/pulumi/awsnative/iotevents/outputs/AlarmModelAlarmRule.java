// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.outputs;

import com.pulumi.awsnative.iotevents.outputs.AlarmModelSimpleRule;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlarmModelAlarmRule {
    private final @Nullable AlarmModelSimpleRule simpleRule;

    @CustomType.Constructor
    private AlarmModelAlarmRule(@CustomType.Parameter("simpleRule") @Nullable AlarmModelSimpleRule simpleRule) {
        this.simpleRule = simpleRule;
    }

    public Optional<AlarmModelSimpleRule> simpleRule() {
        return Optional.ofNullable(this.simpleRule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlarmModelAlarmRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AlarmModelSimpleRule simpleRule;

        public Builder() {
    	      // Empty
        }

        public Builder(AlarmModelAlarmRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.simpleRule = defaults.simpleRule;
        }

        public Builder simpleRule(@Nullable AlarmModelSimpleRule simpleRule) {
            this.simpleRule = simpleRule;
            return this;
        }        public AlarmModelAlarmRule build() {
            return new AlarmModelAlarmRule(simpleRule);
        }
    }
}
