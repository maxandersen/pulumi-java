// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector;

import com.pulumi.awsnative.frauddetector.inputs.OutcomeTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutcomeArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutcomeArgs Empty = new OutcomeArgs();

    /**
     * The outcome description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The outcome description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the outcome.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the outcome.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Tags associated with this outcome.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<OutcomeTagArgs>> tags;

    /**
     * @return Tags associated with this outcome.
     * 
     */
    public Optional<Output<List<OutcomeTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private OutcomeArgs() {}

    private OutcomeArgs(OutcomeArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutcomeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutcomeArgs $;

        public Builder() {
            $ = new OutcomeArgs();
        }

        public Builder(OutcomeArgs defaults) {
            $ = new OutcomeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The outcome description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The outcome description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the outcome.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the outcome.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Tags associated with this outcome.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<OutcomeTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags associated with this outcome.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<OutcomeTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags associated with this outcome.
         * 
         * @return builder
         * 
         */
        public Builder tags(OutcomeTagArgs... tags) {
            return tags(List.of(tags));
        }

        public OutcomeArgs build() {
            return $;
        }
    }

}
