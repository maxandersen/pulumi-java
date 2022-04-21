// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup;

import com.pulumi.awsnative.backup.inputs.FrameworkControlArgs;
import com.pulumi.awsnative.backup.inputs.FrameworkTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FrameworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final FrameworkArgs Empty = new FrameworkArgs();

    /**
     * Contains detailed information about all of the controls of a framework. Each framework must contain at least one control.
     * 
     */
    @Import(name="frameworkControls", required=true)
    private Output<List<FrameworkControlArgs>> frameworkControls;

    public Output<List<FrameworkControlArgs>> frameworkControls() {
        return this.frameworkControls;
    }

    /**
     * An optional description of the framework with a maximum 1,024 characters.
     * 
     */
    @Import(name="frameworkDescription")
    private @Nullable Output<String> frameworkDescription;

    public Optional<Output<String>> frameworkDescription() {
        return Optional.ofNullable(this.frameworkDescription);
    }

    /**
     * The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * 
     */
    @Import(name="frameworkName")
    private @Nullable Output<String> frameworkName;

    public Optional<Output<String>> frameworkName() {
        return Optional.ofNullable(this.frameworkName);
    }

    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    @Import(name="frameworkTags")
    private @Nullable Output<List<FrameworkTagArgs>> frameworkTags;

    public Optional<Output<List<FrameworkTagArgs>>> frameworkTags() {
        return Optional.ofNullable(this.frameworkTags);
    }

    private FrameworkArgs() {}

    private FrameworkArgs(FrameworkArgs $) {
        this.frameworkControls = $.frameworkControls;
        this.frameworkDescription = $.frameworkDescription;
        this.frameworkName = $.frameworkName;
        this.frameworkTags = $.frameworkTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrameworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrameworkArgs $;

        public Builder() {
            $ = new FrameworkArgs();
        }

        public Builder(FrameworkArgs defaults) {
            $ = new FrameworkArgs(Objects.requireNonNull(defaults));
        }

        public Builder frameworkControls(Output<List<FrameworkControlArgs>> frameworkControls) {
            $.frameworkControls = frameworkControls;
            return this;
        }

        public Builder frameworkControls(List<FrameworkControlArgs> frameworkControls) {
            return frameworkControls(Output.of(frameworkControls));
        }

        public Builder frameworkControls(FrameworkControlArgs... frameworkControls) {
            return frameworkControls(List.of(frameworkControls));
        }

        public Builder frameworkDescription(@Nullable Output<String> frameworkDescription) {
            $.frameworkDescription = frameworkDescription;
            return this;
        }

        public Builder frameworkDescription(String frameworkDescription) {
            return frameworkDescription(Output.of(frameworkDescription));
        }

        public Builder frameworkName(@Nullable Output<String> frameworkName) {
            $.frameworkName = frameworkName;
            return this;
        }

        public Builder frameworkName(String frameworkName) {
            return frameworkName(Output.of(frameworkName));
        }

        public Builder frameworkTags(@Nullable Output<List<FrameworkTagArgs>> frameworkTags) {
            $.frameworkTags = frameworkTags;
            return this;
        }

        public Builder frameworkTags(List<FrameworkTagArgs> frameworkTags) {
            return frameworkTags(Output.of(frameworkTags));
        }

        public Builder frameworkTags(FrameworkTagArgs... frameworkTags) {
            return frameworkTags(List.of(frameworkTags));
        }

        public FrameworkArgs build() {
            $.frameworkControls = Objects.requireNonNull($.frameworkControls, "expected parameter 'frameworkControls' to be non-null");
            return $;
        }
    }

}
