// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.gamelift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A set of instructions for launching server processes on each instance in a fleet. Each instruction set identifies the location of the server executable, optional launch parameters, and the number of server processes with this configuration to maintain concurrently on the instance. Server process configurations make up a fleet&#39;s RuntimeConfiguration.
 * 
 */
public final class FleetServerProcessArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetServerProcessArgs Empty = new FleetServerProcessArgs();

    /**
     * The number of server processes that use this configuration to run concurrently on an instance.
     * 
     */
    @Import(name="concurrentExecutions", required=true)
    private Output<Integer> concurrentExecutions;

    public Output<Integer> concurrentExecutions() {
        return this.concurrentExecutions;
    }

    /**
     * The location of the server executable in a custom game build or the name of the Realtime script file that contains the Init() function. Game builds and Realtime scripts are installed on instances at the root:
     * 
     * Windows (for custom game builds only): C:\game. Example: &#34;C:\game\MyGame\server.exe&#34;
     * 
     * Linux: /local/game. Examples: &#34;/local/game/MyGame/server.exe&#34; or &#34;/local/game/MyRealtimeScript.js&#34;
     * 
     */
    @Import(name="launchPath", required=true)
    private Output<String> launchPath;

    public Output<String> launchPath() {
        return this.launchPath;
    }

    /**
     * An optional list of parameters to pass to the server executable or Realtime script on launch.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<String> parameters;

    public Optional<Output<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private FleetServerProcessArgs() {}

    private FleetServerProcessArgs(FleetServerProcessArgs $) {
        this.concurrentExecutions = $.concurrentExecutions;
        this.launchPath = $.launchPath;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetServerProcessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetServerProcessArgs $;

        public Builder() {
            $ = new FleetServerProcessArgs();
        }

        public Builder(FleetServerProcessArgs defaults) {
            $ = new FleetServerProcessArgs(Objects.requireNonNull(defaults));
        }

        public Builder concurrentExecutions(Output<Integer> concurrentExecutions) {
            $.concurrentExecutions = concurrentExecutions;
            return this;
        }

        public Builder concurrentExecutions(Integer concurrentExecutions) {
            return concurrentExecutions(Output.of(concurrentExecutions));
        }

        public Builder launchPath(Output<String> launchPath) {
            $.launchPath = launchPath;
            return this;
        }

        public Builder launchPath(String launchPath) {
            return launchPath(Output.of(launchPath));
        }

        public Builder parameters(@Nullable Output<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(String parameters) {
            return parameters(Output.of(parameters));
        }

        public FleetServerProcessArgs build() {
            $.concurrentExecutions = Objects.requireNonNull($.concurrentExecutions, "expected parameter 'concurrentExecutions' to be non-null");
            $.launchPath = Objects.requireNonNull($.launchPath, "expected parameter 'launchPath' to be non-null");
            return $;
        }
    }

}
