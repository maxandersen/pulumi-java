// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Reboots a VM and waits for it to come back online (Windows). Corresponds to Packer windows-restart provisioner
 * 
 */
public final class ImageTemplateRestartCustomizerResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImageTemplateRestartCustomizerResponse Empty = new ImageTemplateRestartCustomizerResponse();

    /**
     * Friendly Name to provide context on what this customization step does
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Command to check if restart succeeded [Default: &#39;&#39;]
     * 
     */
    @Import(name="restartCheckCommand")
      private final @Nullable String restartCheckCommand;

    public Optional<String> restartCheckCommand() {
        return this.restartCheckCommand == null ? Optional.empty() : Optional.ofNullable(this.restartCheckCommand);
    }

    /**
     * Command to execute the restart [Default: &#39;shutdown /r /f /t 0 /c &#34;packer restart&#34;&#39;]
     * 
     */
    @Import(name="restartCommand")
      private final @Nullable String restartCommand;

    public Optional<String> restartCommand() {
        return this.restartCommand == null ? Optional.empty() : Optional.ofNullable(this.restartCommand);
    }

    /**
     * Restart timeout specified as a string of magnitude and unit, e.g. &#39;5m&#39; (5 minutes) or &#39;2h&#39; (2 hours) [Default: &#39;5m&#39;]
     * 
     */
    @Import(name="restartTimeout")
      private final @Nullable String restartTimeout;

    public Optional<String> restartTimeout() {
        return this.restartTimeout == null ? Optional.empty() : Optional.ofNullable(this.restartTimeout);
    }

    /**
     * The type of customization tool you want to use on the Image. For example, &#34;Shell&#34; can be shell customizer
     * Expected value is &#39;WindowsRestart&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public ImageTemplateRestartCustomizerResponse(
        @Nullable String name,
        @Nullable String restartCheckCommand,
        @Nullable String restartCommand,
        @Nullable String restartTimeout,
        String type) {
        this.name = name;
        this.restartCheckCommand = restartCheckCommand;
        this.restartCommand = restartCommand;
        this.restartTimeout = restartTimeout;
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private ImageTemplateRestartCustomizerResponse() {
        this.name = null;
        this.restartCheckCommand = null;
        this.restartCommand = null;
        this.restartTimeout = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateRestartCustomizerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String restartCheckCommand;
        private @Nullable String restartCommand;
        private @Nullable String restartTimeout;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateRestartCustomizerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.restartCheckCommand = defaults.restartCheckCommand;
    	      this.restartCommand = defaults.restartCommand;
    	      this.restartTimeout = defaults.restartTimeout;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder restartCheckCommand(@Nullable String restartCheckCommand) {
            this.restartCheckCommand = restartCheckCommand;
            return this;
        }
        public Builder restartCommand(@Nullable String restartCommand) {
            this.restartCommand = restartCommand;
            return this;
        }
        public Builder restartTimeout(@Nullable String restartTimeout) {
            this.restartTimeout = restartTimeout;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ImageTemplateRestartCustomizerResponse build() {
            return new ImageTemplateRestartCustomizerResponse(name, restartCheckCommand, restartCommand, restartTimeout, type);
        }
    }
}
