// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Script reference
 * 
 */
public final class ScriptReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScriptReferenceArgs Empty = new ScriptReferenceArgs();

    /**
     * Optional command line arguments passed to the script to run.
     * 
     */
    @Import(name="scriptArguments")
    private @Nullable Output<String> scriptArguments;

    /**
     * @return Optional command line arguments passed to the script to run.
     * 
     */
    public Optional<Output<String>> scriptArguments() {
        return Optional.ofNullable(this.scriptArguments);
    }

    /**
     * The location of scripts in the mounted volume.
     * 
     */
    @Import(name="scriptData")
    private @Nullable Output<String> scriptData;

    /**
     * @return The location of scripts in the mounted volume.
     * 
     */
    public Optional<Output<String>> scriptData() {
        return Optional.ofNullable(this.scriptData);
    }

    /**
     * The storage source of the script: inline, workspace.
     * 
     */
    @Import(name="scriptSource")
    private @Nullable Output<String> scriptSource;

    /**
     * @return The storage source of the script: inline, workspace.
     * 
     */
    public Optional<Output<String>> scriptSource() {
        return Optional.ofNullable(this.scriptSource);
    }

    /**
     * Optional time period passed to timeout command.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    /**
     * @return Optional time period passed to timeout command.
     * 
     */
    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private ScriptReferenceArgs() {}

    private ScriptReferenceArgs(ScriptReferenceArgs $) {
        this.scriptArguments = $.scriptArguments;
        this.scriptData = $.scriptData;
        this.scriptSource = $.scriptSource;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScriptReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScriptReferenceArgs $;

        public Builder() {
            $ = new ScriptReferenceArgs();
        }

        public Builder(ScriptReferenceArgs defaults) {
            $ = new ScriptReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scriptArguments Optional command line arguments passed to the script to run.
         * 
         * @return builder
         * 
         */
        public Builder scriptArguments(@Nullable Output<String> scriptArguments) {
            $.scriptArguments = scriptArguments;
            return this;
        }

        /**
         * @param scriptArguments Optional command line arguments passed to the script to run.
         * 
         * @return builder
         * 
         */
        public Builder scriptArguments(String scriptArguments) {
            return scriptArguments(Output.of(scriptArguments));
        }

        /**
         * @param scriptData The location of scripts in the mounted volume.
         * 
         * @return builder
         * 
         */
        public Builder scriptData(@Nullable Output<String> scriptData) {
            $.scriptData = scriptData;
            return this;
        }

        /**
         * @param scriptData The location of scripts in the mounted volume.
         * 
         * @return builder
         * 
         */
        public Builder scriptData(String scriptData) {
            return scriptData(Output.of(scriptData));
        }

        /**
         * @param scriptSource The storage source of the script: inline, workspace.
         * 
         * @return builder
         * 
         */
        public Builder scriptSource(@Nullable Output<String> scriptSource) {
            $.scriptSource = scriptSource;
            return this;
        }

        /**
         * @param scriptSource The storage source of the script: inline, workspace.
         * 
         * @return builder
         * 
         */
        public Builder scriptSource(String scriptSource) {
            return scriptSource(Output.of(scriptSource));
        }

        /**
         * @param timeout Optional time period passed to timeout command.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Optional time period passed to timeout command.
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public ScriptReferenceArgs build() {
            return $;
        }
    }

}
