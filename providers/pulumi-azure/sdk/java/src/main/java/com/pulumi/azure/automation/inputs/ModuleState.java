// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation.inputs;

import com.pulumi.azure.automation.inputs.ModuleModuleLinkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModuleState extends com.pulumi.resources.ResourceArgs {

    public static final ModuleState Empty = new ModuleState();

    /**
     * The name of the automation account in which the Module is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="automationAccountName")
    private @Nullable Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the Module is created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> automationAccountName() {
        return Optional.ofNullable(this.automationAccountName);
    }

    /**
     * The published Module link.
     * 
     */
    @Import(name="moduleLink")
    private @Nullable Output<ModuleModuleLinkArgs> moduleLink;

    /**
     * @return The published Module link.
     * 
     */
    public Optional<Output<ModuleModuleLinkArgs>> moduleLink() {
        return Optional.ofNullable(this.moduleLink);
    }

    /**
     * Specifies the name of the Module. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Module. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which the Module is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Module is created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private ModuleState() {}

    private ModuleState(ModuleState $) {
        this.automationAccountName = $.automationAccountName;
        this.moduleLink = $.moduleLink;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModuleState $;

        public Builder() {
            $ = new ModuleState();
        }

        public Builder(ModuleState defaults) {
            $ = new ModuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account in which the Module is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(@Nullable Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param automationAccountName The name of the automation account in which the Module is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        /**
         * @param moduleLink The published Module link.
         * 
         * @return builder
         * 
         */
        public Builder moduleLink(@Nullable Output<ModuleModuleLinkArgs> moduleLink) {
            $.moduleLink = moduleLink;
            return this;
        }

        /**
         * @param moduleLink The published Module link.
         * 
         * @return builder
         * 
         */
        public Builder moduleLink(ModuleModuleLinkArgs moduleLink) {
            return moduleLink(Output.of(moduleLink));
        }

        /**
         * @param name Specifies the name of the Module. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Module. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Module is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Module is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ModuleState build() {
            return $;
        }
    }

}
