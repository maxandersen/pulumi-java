// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.inputs.OperationsDefinitionDisplayArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of an Operation.
 * 
 */
public final class OperationsDefinitionArgs extends ResourceArgs {

    public static final OperationsDefinitionArgs Empty = new OperationsDefinitionArgs();

    @Import(name="actionType")
    private @Nullable Output<String> actionType;

    public Optional<Output<String>> actionType() {
        return Optional.ofNullable(this.actionType);
    }

    /**
     * Display information of the operation.
     * 
     */
    @Import(name="display", required=true)
    private Output<OperationsDefinitionDisplayArgs> display;

    /**
     * @return Display information of the operation.
     * 
     */
    public Output<OperationsDefinitionDisplayArgs> display() {
        return this.display;
    }

    /**
     * Indicates whether the operation applies to data-plane.
     * 
     */
    @Import(name="isDataAction")
    private @Nullable Output<Boolean> isDataAction;

    /**
     * @return Indicates whether the operation applies to data-plane.
     * 
     */
    public Optional<Output<Boolean>> isDataAction() {
        return Optional.ofNullable(this.isDataAction);
    }

    /**
     * Name of the operation.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the operation.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="origin")
    private @Nullable Output<String> origin;

    public Optional<Output<String>> origin() {
        return Optional.ofNullable(this.origin);
    }

    @Import(name="properties")
    private @Nullable Output<Object> properties;

    public Optional<Output<Object>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private OperationsDefinitionArgs() {}

    private OperationsDefinitionArgs(OperationsDefinitionArgs $) {
        this.actionType = $.actionType;
        this.display = $.display;
        this.isDataAction = $.isDataAction;
        this.name = $.name;
        this.origin = $.origin;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OperationsDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OperationsDefinitionArgs $;

        public Builder() {
            $ = new OperationsDefinitionArgs();
        }

        public Builder(OperationsDefinitionArgs defaults) {
            $ = new OperationsDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder actionType(@Nullable Output<String> actionType) {
            $.actionType = actionType;
            return this;
        }

        public Builder actionType(String actionType) {
            return actionType(Output.of(actionType));
        }

        /**
         * @param display Display information of the operation.
         * 
         * @return builder
         * 
         */
        public Builder display(Output<OperationsDefinitionDisplayArgs> display) {
            $.display = display;
            return this;
        }

        /**
         * @param display Display information of the operation.
         * 
         * @return builder
         * 
         */
        public Builder display(OperationsDefinitionDisplayArgs display) {
            return display(Output.of(display));
        }

        /**
         * @param isDataAction Indicates whether the operation applies to data-plane.
         * 
         * @return builder
         * 
         */
        public Builder isDataAction(@Nullable Output<Boolean> isDataAction) {
            $.isDataAction = isDataAction;
            return this;
        }

        /**
         * @param isDataAction Indicates whether the operation applies to data-plane.
         * 
         * @return builder
         * 
         */
        public Builder isDataAction(Boolean isDataAction) {
            return isDataAction(Output.of(isDataAction));
        }

        /**
         * @param name Name of the operation.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the operation.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder origin(@Nullable Output<String> origin) {
            $.origin = origin;
            return this;
        }

        public Builder origin(String origin) {
            return origin(Output.of(origin));
        }

        public Builder properties(@Nullable Output<Object> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Object properties) {
            return properties(Output.of(properties));
        }

        public OperationsDefinitionArgs build() {
            $.display = Objects.requireNonNull($.display, "expected parameter 'display' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
