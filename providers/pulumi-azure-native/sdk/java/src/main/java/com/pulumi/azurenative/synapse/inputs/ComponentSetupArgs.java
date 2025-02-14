// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.azurenative.synapse.inputs.SecureStringArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The custom setup of installing 3rd party components.
 * 
 */
public final class ComponentSetupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComponentSetupArgs Empty = new ComponentSetupArgs();

    /**
     * The name of the 3rd party component.
     * 
     */
    @Import(name="componentName", required=true)
    private Output<String> componentName;

    /**
     * @return The name of the 3rd party component.
     * 
     */
    public Output<String> componentName() {
        return this.componentName;
    }

    /**
     * The license key to activate the component.
     * 
     */
    @Import(name="licenseKey")
    private @Nullable Output<SecureStringArgs> licenseKey;

    /**
     * @return The license key to activate the component.
     * 
     */
    public Optional<Output<SecureStringArgs>> licenseKey() {
        return Optional.ofNullable(this.licenseKey);
    }

    /**
     * The type of custom setup.
     * Expected value is &#39;ComponentSetup&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of custom setup.
     * Expected value is &#39;ComponentSetup&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ComponentSetupArgs() {}

    private ComponentSetupArgs(ComponentSetupArgs $) {
        this.componentName = $.componentName;
        this.licenseKey = $.licenseKey;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComponentSetupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComponentSetupArgs $;

        public Builder() {
            $ = new ComponentSetupArgs();
        }

        public Builder(ComponentSetupArgs defaults) {
            $ = new ComponentSetupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentName The name of the 3rd party component.
         * 
         * @return builder
         * 
         */
        public Builder componentName(Output<String> componentName) {
            $.componentName = componentName;
            return this;
        }

        /**
         * @param componentName The name of the 3rd party component.
         * 
         * @return builder
         * 
         */
        public Builder componentName(String componentName) {
            return componentName(Output.of(componentName));
        }

        /**
         * @param licenseKey The license key to activate the component.
         * 
         * @return builder
         * 
         */
        public Builder licenseKey(@Nullable Output<SecureStringArgs> licenseKey) {
            $.licenseKey = licenseKey;
            return this;
        }

        /**
         * @param licenseKey The license key to activate the component.
         * 
         * @return builder
         * 
         */
        public Builder licenseKey(SecureStringArgs licenseKey) {
            return licenseKey(Output.of(licenseKey));
        }

        /**
         * @param type The type of custom setup.
         * Expected value is &#39;ComponentSetup&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of custom setup.
         * Expected value is &#39;ComponentSetup&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ComponentSetupArgs build() {
            $.componentName = Objects.requireNonNull($.componentName, "expected parameter 'componentName' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
