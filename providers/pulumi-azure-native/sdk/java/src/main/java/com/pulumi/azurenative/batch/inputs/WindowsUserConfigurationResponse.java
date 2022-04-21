// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsUserConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final WindowsUserConfigurationResponse Empty = new WindowsUserConfigurationResponse();

    /**
     * Specifies login mode for the user. The default value for VirtualMachineConfiguration pools is interactive mode and for CloudServiceConfiguration pools is batch mode.
     * 
     */
    @Import(name="loginMode")
    private @Nullable String loginMode;

    public Optional<String> loginMode() {
        return Optional.ofNullable(this.loginMode);
    }

    private WindowsUserConfigurationResponse() {}

    private WindowsUserConfigurationResponse(WindowsUserConfigurationResponse $) {
        this.loginMode = $.loginMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsUserConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsUserConfigurationResponse $;

        public Builder() {
            $ = new WindowsUserConfigurationResponse();
        }

        public Builder(WindowsUserConfigurationResponse defaults) {
            $ = new WindowsUserConfigurationResponse(Objects.requireNonNull(defaults));
        }

        public Builder loginMode(@Nullable String loginMode) {
            $.loginMode = loginMode;
            return this;
        }

        public WindowsUserConfigurationResponse build() {
            return $;
        }
    }

}
