// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.testing_v1.enums.RoboDirectiveActionType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Directs Robo to interact with a specific UI element if it is encountered during the crawl. Currently, Robo can perform text entry or element click.
 * 
 */
public final class RoboDirectiveArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoboDirectiveArgs Empty = new RoboDirectiveArgs();

    /**
     * The type of action that Robo should perform on the specified element.
     * 
     */
    @Import(name="actionType", required=true)
      private final Output<RoboDirectiveActionType> actionType;

    public Output<RoboDirectiveActionType> actionType() {
        return this.actionType;
    }

    /**
     * The text that Robo is directed to set. If left empty, the directive will be treated as a CLICK on the element matching the resource_name.
     * 
     */
    @Import(name="inputText")
      private final @Nullable Output<String> inputText;

    public Output<String> inputText() {
        return this.inputText == null ? Codegen.empty() : this.inputText;
    }

    /**
     * The android resource name of the target UI element. For example, in Java: R.string.foo in xml: @string/foo Only the &#34;foo&#34; part is needed. Reference doc: https://developer.android.com/guide/topics/resources/accessing-resources.html
     * 
     */
    @Import(name="resourceName", required=true)
      private final Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName;
    }

    public RoboDirectiveArgs(
        Output<RoboDirectiveActionType> actionType,
        @Nullable Output<String> inputText,
        Output<String> resourceName) {
        this.actionType = Objects.requireNonNull(actionType, "expected parameter 'actionType' to be non-null");
        this.inputText = inputText;
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private RoboDirectiveArgs() {
        this.actionType = Codegen.empty();
        this.inputText = Codegen.empty();
        this.resourceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoboDirectiveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RoboDirectiveActionType> actionType;
        private @Nullable Output<String> inputText;
        private Output<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(RoboDirectiveArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.inputText = defaults.inputText;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder actionType(Output<RoboDirectiveActionType> actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }
        public Builder actionType(RoboDirectiveActionType actionType) {
            this.actionType = Output.of(Objects.requireNonNull(actionType));
            return this;
        }
        public Builder inputText(@Nullable Output<String> inputText) {
            this.inputText = inputText;
            return this;
        }
        public Builder inputText(@Nullable String inputText) {
            this.inputText = Codegen.ofNullable(inputText);
            return this;
        }
        public Builder resourceName(Output<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Output.of(Objects.requireNonNull(resourceName));
            return this;
        }        public RoboDirectiveArgs build() {
            return new RoboDirectiveArgs(actionType, inputText, resourceName);
        }
    }
}
