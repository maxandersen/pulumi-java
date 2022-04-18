// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CommandResponse {
    /**
     * Command-line arguments used when executing this command.
     * 
     */
    private final List<String> args;
    /**
     * Working directory (relative to project source root) used when running this command.
     * 
     */
    private final String dir;
    /**
     * Environment variables set before running this command.
     * 
     */
    private final List<String> env;
    /**
     * Name of the command, as presented on the command line, or if the command is packaged as a Docker container, as presented to `docker pull`.
     * 
     */
    private final String name;
    /**
     * The ID(s) of the command(s) that this command depends on.
     * 
     */
    private final List<String> waitFor;

    @CustomType.Constructor
    private CommandResponse(
        @CustomType.Parameter("args") List<String> args,
        @CustomType.Parameter("dir") String dir,
        @CustomType.Parameter("env") List<String> env,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("waitFor") List<String> waitFor) {
        this.args = args;
        this.dir = dir;
        this.env = env;
        this.name = name;
        this.waitFor = waitFor;
    }

    /**
     * Command-line arguments used when executing this command.
     * 
    */
    public List<String> args() {
        return this.args;
    }
    /**
     * Working directory (relative to project source root) used when running this command.
     * 
    */
    public String dir() {
        return this.dir;
    }
    /**
     * Environment variables set before running this command.
     * 
    */
    public List<String> env() {
        return this.env;
    }
    /**
     * Name of the command, as presented on the command line, or if the command is packaged as a Docker container, as presented to `docker pull`.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The ID(s) of the command(s) that this command depends on.
     * 
    */
    public List<String> waitFor() {
        return this.waitFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommandResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> args;
        private String dir;
        private List<String> env;
        private String name;
        private List<String> waitFor;

        public Builder() {
    	      // Empty
        }

        public Builder(CommandResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.dir = defaults.dir;
    	      this.env = defaults.env;
    	      this.name = defaults.name;
    	      this.waitFor = defaults.waitFor;
        }

        public Builder args(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder dir(String dir) {
            this.dir = Objects.requireNonNull(dir);
            return this;
        }
        public Builder env(List<String> env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }
        public Builder env(String... env) {
            return env(List.of(env));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder waitFor(List<String> waitFor) {
            this.waitFor = Objects.requireNonNull(waitFor);
            return this;
        }
        public Builder waitFor(String... waitFor) {
            return waitFor(List.of(waitFor));
        }        public CommandResponse build() {
            return new CommandResponse(args, dir, env, name, waitFor);
        }
    }
}
