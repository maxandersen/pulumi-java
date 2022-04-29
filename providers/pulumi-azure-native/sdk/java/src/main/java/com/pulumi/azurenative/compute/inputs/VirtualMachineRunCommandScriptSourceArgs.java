// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the script sources for run command.
 * 
 */
public final class VirtualMachineRunCommandScriptSourceArgs extends ResourceArgs {

    public static final VirtualMachineRunCommandScriptSourceArgs Empty = new VirtualMachineRunCommandScriptSourceArgs();

    /**
     * Specifies a commandId of predefined built-in script.
     * 
     */
    @Import(name="commandId")
    private @Nullable Output<String> commandId;

    /**
     * @return Specifies a commandId of predefined built-in script.
     * 
     */
    public Optional<Output<String>> commandId() {
        return Optional.ofNullable(this.commandId);
    }

    /**
     * Specifies the script content to be executed on the VM.
     * 
     */
    @Import(name="script")
    private @Nullable Output<String> script;

    /**
     * @return Specifies the script content to be executed on the VM.
     * 
     */
    public Optional<Output<String>> script() {
        return Optional.ofNullable(this.script);
    }

    /**
     * Specifies the script download location.
     * 
     */
    @Import(name="scriptUri")
    private @Nullable Output<String> scriptUri;

    /**
     * @return Specifies the script download location.
     * 
     */
    public Optional<Output<String>> scriptUri() {
        return Optional.ofNullable(this.scriptUri);
    }

    private VirtualMachineRunCommandScriptSourceArgs() {}

    private VirtualMachineRunCommandScriptSourceArgs(VirtualMachineRunCommandScriptSourceArgs $) {
        this.commandId = $.commandId;
        this.script = $.script;
        this.scriptUri = $.scriptUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineRunCommandScriptSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineRunCommandScriptSourceArgs $;

        public Builder() {
            $ = new VirtualMachineRunCommandScriptSourceArgs();
        }

        public Builder(VirtualMachineRunCommandScriptSourceArgs defaults) {
            $ = new VirtualMachineRunCommandScriptSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commandId Specifies a commandId of predefined built-in script.
         * 
         * @return builder
         * 
         */
        public Builder commandId(@Nullable Output<String> commandId) {
            $.commandId = commandId;
            return this;
        }

        /**
         * @param commandId Specifies a commandId of predefined built-in script.
         * 
         * @return builder
         * 
         */
        public Builder commandId(String commandId) {
            return commandId(Output.of(commandId));
        }

        /**
         * @param script Specifies the script content to be executed on the VM.
         * 
         * @return builder
         * 
         */
        public Builder script(@Nullable Output<String> script) {
            $.script = script;
            return this;
        }

        /**
         * @param script Specifies the script content to be executed on the VM.
         * 
         * @return builder
         * 
         */
        public Builder script(String script) {
            return script(Output.of(script));
        }

        /**
         * @param scriptUri Specifies the script download location.
         * 
         * @return builder
         * 
         */
        public Builder scriptUri(@Nullable Output<String> scriptUri) {
            $.scriptUri = scriptUri;
            return this;
        }

        /**
         * @param scriptUri Specifies the script download location.
         * 
         * @return builder
         * 
         */
        public Builder scriptUri(String scriptUri) {
            return scriptUri(Output.of(scriptUri));
        }

        public VirtualMachineRunCommandScriptSourceArgs build() {
            return $;
        }
    }

}
