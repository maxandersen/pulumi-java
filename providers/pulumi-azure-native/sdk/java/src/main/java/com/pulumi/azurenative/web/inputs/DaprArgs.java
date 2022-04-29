// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.DaprComponentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container App Dapr configuration.
 * 
 */
public final class DaprArgs extends ResourceArgs {

    public static final DaprArgs Empty = new DaprArgs();

    /**
     * Dapr application identifier
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return Dapr application identifier
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * Port on which the Dapr side car
     * 
     */
    @Import(name="appPort")
    private @Nullable Output<Integer> appPort;

    /**
     * @return Port on which the Dapr side car
     * 
     */
    public Optional<Output<Integer>> appPort() {
        return Optional.ofNullable(this.appPort);
    }

    /**
     * Collection of Dapr components
     * 
     */
    @Import(name="components")
    private @Nullable Output<List<DaprComponentArgs>> components;

    /**
     * @return Collection of Dapr components
     * 
     */
    public Optional<Output<List<DaprComponentArgs>>> components() {
        return Optional.ofNullable(this.components);
    }

    /**
     * Boolean indicating if the Dapr side car is enabled
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Boolean indicating if the Dapr side car is enabled
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private DaprArgs() {}

    private DaprArgs(DaprArgs $) {
        this.appId = $.appId;
        this.appPort = $.appPort;
        this.components = $.components;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DaprArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DaprArgs $;

        public Builder() {
            $ = new DaprArgs();
        }

        public Builder(DaprArgs defaults) {
            $ = new DaprArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId Dapr application identifier
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId Dapr application identifier
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param appPort Port on which the Dapr side car
         * 
         * @return builder
         * 
         */
        public Builder appPort(@Nullable Output<Integer> appPort) {
            $.appPort = appPort;
            return this;
        }

        /**
         * @param appPort Port on which the Dapr side car
         * 
         * @return builder
         * 
         */
        public Builder appPort(Integer appPort) {
            return appPort(Output.of(appPort));
        }

        /**
         * @param components Collection of Dapr components
         * 
         * @return builder
         * 
         */
        public Builder components(@Nullable Output<List<DaprComponentArgs>> components) {
            $.components = components;
            return this;
        }

        /**
         * @param components Collection of Dapr components
         * 
         * @return builder
         * 
         */
        public Builder components(List<DaprComponentArgs> components) {
            return components(Output.of(components));
        }

        /**
         * @param components Collection of Dapr components
         * 
         * @return builder
         * 
         */
        public Builder components(DaprComponentArgs... components) {
            return components(List.of(components));
        }

        /**
         * @param enabled Boolean indicating if the Dapr side car is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Boolean indicating if the Dapr side car is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public DaprArgs build() {
            return $;
        }
    }

}
