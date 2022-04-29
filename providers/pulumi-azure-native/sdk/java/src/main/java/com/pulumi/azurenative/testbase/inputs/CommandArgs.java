// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase.inputs;

import com.pulumi.azurenative.testbase.enums.Action;
import com.pulumi.azurenative.testbase.enums.ContentType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The command used in the test
 * 
 */
public final class CommandArgs extends ResourceArgs {

    public static final CommandArgs Empty = new CommandArgs();

    /**
     * The action of the command.
     * 
     */
    @Import(name="action", required=true)
    private Output<Either<String,Action>> action;

    /**
     * @return The action of the command.
     * 
     */
    public Output<Either<String,Action>> action() {
        return this.action;
    }

    /**
     * Specifies whether to run the command even if a previous command is failed.
     * 
     */
    @Import(name="alwaysRun")
    private @Nullable Output<Boolean> alwaysRun;

    /**
     * @return Specifies whether to run the command even if a previous command is failed.
     * 
     */
    public Optional<Output<Boolean>> alwaysRun() {
        return Optional.ofNullable(this.alwaysRun);
    }

    /**
     * Specifies whether to apply update before the command.
     * 
     */
    @Import(name="applyUpdateBefore")
    private @Nullable Output<Boolean> applyUpdateBefore;

    /**
     * @return Specifies whether to apply update before the command.
     * 
     */
    public Optional<Output<Boolean>> applyUpdateBefore() {
        return Optional.ofNullable(this.applyUpdateBefore);
    }

    /**
     * The content of the command. The content depends on source type.
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    /**
     * @return The content of the command. The content depends on source type.
     * 
     */
    public Output<String> content() {
        return this.content;
    }

    /**
     * The type of command content.
     * 
     */
    @Import(name="contentType", required=true)
    private Output<Either<String,ContentType>> contentType;

    /**
     * @return The type of command content.
     * 
     */
    public Output<Either<String,ContentType>> contentType() {
        return this.contentType;
    }

    /**
     * Specifies the max run time of the command.
     * 
     */
    @Import(name="maxRunTime")
    private @Nullable Output<Integer> maxRunTime;

    /**
     * @return Specifies the max run time of the command.
     * 
     */
    public Optional<Output<Integer>> maxRunTime() {
        return Optional.ofNullable(this.maxRunTime);
    }

    /**
     * The name of the command.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the command.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies whether to restart the VM after the command executed.
     * 
     */
    @Import(name="restartAfter")
    private @Nullable Output<Boolean> restartAfter;

    /**
     * @return Specifies whether to restart the VM after the command executed.
     * 
     */
    public Optional<Output<Boolean>> restartAfter() {
        return Optional.ofNullable(this.restartAfter);
    }

    /**
     * Specifies whether to run the command in interactive mode.
     * 
     */
    @Import(name="runAsInteractive")
    private @Nullable Output<Boolean> runAsInteractive;

    /**
     * @return Specifies whether to run the command in interactive mode.
     * 
     */
    public Optional<Output<Boolean>> runAsInteractive() {
        return Optional.ofNullable(this.runAsInteractive);
    }

    /**
     * Specifies whether to run the command as administrator.
     * 
     */
    @Import(name="runElevated")
    private @Nullable Output<Boolean> runElevated;

    /**
     * @return Specifies whether to run the command as administrator.
     * 
     */
    public Optional<Output<Boolean>> runElevated() {
        return Optional.ofNullable(this.runElevated);
    }

    private CommandArgs() {}

    private CommandArgs(CommandArgs $) {
        this.action = $.action;
        this.alwaysRun = $.alwaysRun;
        this.applyUpdateBefore = $.applyUpdateBefore;
        this.content = $.content;
        this.contentType = $.contentType;
        this.maxRunTime = $.maxRunTime;
        this.name = $.name;
        this.restartAfter = $.restartAfter;
        this.runAsInteractive = $.runAsInteractive;
        this.runElevated = $.runElevated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CommandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CommandArgs $;

        public Builder() {
            $ = new CommandArgs();
        }

        public Builder(CommandArgs defaults) {
            $ = new CommandArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action of the command.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<Either<String,Action>> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action of the command.
         * 
         * @return builder
         * 
         */
        public Builder action(Either<String,Action> action) {
            return action(Output.of(action));
        }

        /**
         * @param action The action of the command.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Either.ofLeft(action));
        }

        /**
         * @param action The action of the command.
         * 
         * @return builder
         * 
         */
        public Builder action(Action action) {
            return action(Either.ofRight(action));
        }

        /**
         * @param alwaysRun Specifies whether to run the command even if a previous command is failed.
         * 
         * @return builder
         * 
         */
        public Builder alwaysRun(@Nullable Output<Boolean> alwaysRun) {
            $.alwaysRun = alwaysRun;
            return this;
        }

        /**
         * @param alwaysRun Specifies whether to run the command even if a previous command is failed.
         * 
         * @return builder
         * 
         */
        public Builder alwaysRun(Boolean alwaysRun) {
            return alwaysRun(Output.of(alwaysRun));
        }

        /**
         * @param applyUpdateBefore Specifies whether to apply update before the command.
         * 
         * @return builder
         * 
         */
        public Builder applyUpdateBefore(@Nullable Output<Boolean> applyUpdateBefore) {
            $.applyUpdateBefore = applyUpdateBefore;
            return this;
        }

        /**
         * @param applyUpdateBefore Specifies whether to apply update before the command.
         * 
         * @return builder
         * 
         */
        public Builder applyUpdateBefore(Boolean applyUpdateBefore) {
            return applyUpdateBefore(Output.of(applyUpdateBefore));
        }

        /**
         * @param content The content of the command. The content depends on source type.
         * 
         * @return builder
         * 
         */
        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The content of the command. The content depends on source type.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param contentType The type of command content.
         * 
         * @return builder
         * 
         */
        public Builder contentType(Output<Either<String,ContentType>> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The type of command content.
         * 
         * @return builder
         * 
         */
        public Builder contentType(Either<String,ContentType> contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param contentType The type of command content.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Either.ofLeft(contentType));
        }

        /**
         * @param contentType The type of command content.
         * 
         * @return builder
         * 
         */
        public Builder contentType(ContentType contentType) {
            return contentType(Either.ofRight(contentType));
        }

        /**
         * @param maxRunTime Specifies the max run time of the command.
         * 
         * @return builder
         * 
         */
        public Builder maxRunTime(@Nullable Output<Integer> maxRunTime) {
            $.maxRunTime = maxRunTime;
            return this;
        }

        /**
         * @param maxRunTime Specifies the max run time of the command.
         * 
         * @return builder
         * 
         */
        public Builder maxRunTime(Integer maxRunTime) {
            return maxRunTime(Output.of(maxRunTime));
        }

        /**
         * @param name The name of the command.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the command.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param restartAfter Specifies whether to restart the VM after the command executed.
         * 
         * @return builder
         * 
         */
        public Builder restartAfter(@Nullable Output<Boolean> restartAfter) {
            $.restartAfter = restartAfter;
            return this;
        }

        /**
         * @param restartAfter Specifies whether to restart the VM after the command executed.
         * 
         * @return builder
         * 
         */
        public Builder restartAfter(Boolean restartAfter) {
            return restartAfter(Output.of(restartAfter));
        }

        /**
         * @param runAsInteractive Specifies whether to run the command in interactive mode.
         * 
         * @return builder
         * 
         */
        public Builder runAsInteractive(@Nullable Output<Boolean> runAsInteractive) {
            $.runAsInteractive = runAsInteractive;
            return this;
        }

        /**
         * @param runAsInteractive Specifies whether to run the command in interactive mode.
         * 
         * @return builder
         * 
         */
        public Builder runAsInteractive(Boolean runAsInteractive) {
            return runAsInteractive(Output.of(runAsInteractive));
        }

        /**
         * @param runElevated Specifies whether to run the command as administrator.
         * 
         * @return builder
         * 
         */
        public Builder runElevated(@Nullable Output<Boolean> runElevated) {
            $.runElevated = runElevated;
            return this;
        }

        /**
         * @param runElevated Specifies whether to run the command as administrator.
         * 
         * @return builder
         * 
         */
        public Builder runElevated(Boolean runElevated) {
            return runElevated(Output.of(runElevated));
        }

        public CommandArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            $.contentType = Objects.requireNonNull($.contentType, "expected parameter 'contentType' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
