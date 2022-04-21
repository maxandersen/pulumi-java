// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecommit.inputs;

import com.pulumi.aws.codecommit.inputs.TriggerTriggerGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerState extends com.pulumi.resources.ResourceArgs {

    public static final TriggerState Empty = new TriggerState();

    /**
     * System-generated unique identifier.
     * 
     */
    @Import(name="configurationId")
    private @Nullable Output<String> configurationId;

    public Optional<Output<String>> configurationId() {
        return Optional.ofNullable(this.configurationId);
    }

    /**
     * The name for the repository. This needs to be less than 100 characters.
     * 
     */
    @Import(name="repositoryName")
    private @Nullable Output<String> repositoryName;

    public Optional<Output<String>> repositoryName() {
        return Optional.ofNullable(this.repositoryName);
    }

    @Import(name="triggers")
    private @Nullable Output<List<TriggerTriggerGetArgs>> triggers;

    public Optional<Output<List<TriggerTriggerGetArgs>>> triggers() {
        return Optional.ofNullable(this.triggers);
    }

    private TriggerState() {}

    private TriggerState(TriggerState $) {
        this.configurationId = $.configurationId;
        this.repositoryName = $.repositoryName;
        this.triggers = $.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerState $;

        public Builder() {
            $ = new TriggerState();
        }

        public Builder(TriggerState defaults) {
            $ = new TriggerState(Objects.requireNonNull(defaults));
        }

        public Builder configurationId(@Nullable Output<String> configurationId) {
            $.configurationId = configurationId;
            return this;
        }

        public Builder configurationId(String configurationId) {
            return configurationId(Output.of(configurationId));
        }

        public Builder repositoryName(@Nullable Output<String> repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        public Builder repositoryName(String repositoryName) {
            return repositoryName(Output.of(repositoryName));
        }

        public Builder triggers(@Nullable Output<List<TriggerTriggerGetArgs>> triggers) {
            $.triggers = triggers;
            return this;
        }

        public Builder triggers(List<TriggerTriggerGetArgs> triggers) {
            return triggers(Output.of(triggers));
        }

        public Builder triggers(TriggerTriggerGetArgs... triggers) {
            return triggers(List.of(triggers));
        }

        public TriggerState build() {
            return $;
        }
    }

}
