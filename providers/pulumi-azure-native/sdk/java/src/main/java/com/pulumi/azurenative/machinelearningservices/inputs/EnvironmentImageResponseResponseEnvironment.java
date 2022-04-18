// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.ModelEnvironmentDefinitionResponseResponseDocker;
import com.pulumi.azurenative.machinelearningservices.inputs.ModelEnvironmentDefinitionResponseResponsePython;
import com.pulumi.azurenative.machinelearningservices.inputs.ModelEnvironmentDefinitionResponseResponseR;
import com.pulumi.azurenative.machinelearningservices.inputs.ModelEnvironmentDefinitionResponseResponseSpark;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The details of the AZURE ML environment.
 * 
 */
public final class EnvironmentImageResponseResponseEnvironment extends com.pulumi.resources.InvokeArgs {

    public static final EnvironmentImageResponseResponseEnvironment Empty = new EnvironmentImageResponseResponseEnvironment();

    /**
     * The definition of a Docker container.
     * 
     */
    @Import(name="docker")
      private final @Nullable ModelEnvironmentDefinitionResponseResponseDocker docker;

    public Optional<ModelEnvironmentDefinitionResponseResponseDocker> docker() {
        return this.docker == null ? Optional.empty() : Optional.ofNullable(this.docker);
    }

    /**
     * Definition of environment variables to be defined in the environment.
     * 
     */
    @Import(name="environmentVariables")
      private final @Nullable Map<String,String> environmentVariables;

    public Map<String,String> environmentVariables() {
        return this.environmentVariables == null ? Map.of() : this.environmentVariables;
    }

    /**
     * The inferencing stack version added to the image. To avoid adding an inferencing stack, do not set this value. Valid values: "latest".
     * 
     */
    @Import(name="inferencingStackVersion")
      private final @Nullable String inferencingStackVersion;

    public Optional<String> inferencingStackVersion() {
        return this.inferencingStackVersion == null ? Optional.empty() : Optional.ofNullable(this.inferencingStackVersion);
    }

    /**
     * The name of the environment.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Settings for a Python environment.
     * 
     */
    @Import(name="python")
      private final @Nullable ModelEnvironmentDefinitionResponseResponsePython python;

    public Optional<ModelEnvironmentDefinitionResponseResponsePython> python() {
        return this.python == null ? Optional.empty() : Optional.ofNullable(this.python);
    }

    /**
     * Settings for a R environment.
     * 
     */
    @Import(name="r")
      private final @Nullable ModelEnvironmentDefinitionResponseResponseR r;

    public Optional<ModelEnvironmentDefinitionResponseResponseR> r() {
        return this.r == null ? Optional.empty() : Optional.ofNullable(this.r);
    }

    /**
     * The configuration for a Spark environment.
     * 
     */
    @Import(name="spark")
      private final @Nullable ModelEnvironmentDefinitionResponseResponseSpark spark;

    public Optional<ModelEnvironmentDefinitionResponseResponseSpark> spark() {
        return this.spark == null ? Optional.empty() : Optional.ofNullable(this.spark);
    }

    /**
     * The environment version.
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> version() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public EnvironmentImageResponseResponseEnvironment(
        @Nullable ModelEnvironmentDefinitionResponseResponseDocker docker,
        @Nullable Map<String,String> environmentVariables,
        @Nullable String inferencingStackVersion,
        @Nullable String name,
        @Nullable ModelEnvironmentDefinitionResponseResponsePython python,
        @Nullable ModelEnvironmentDefinitionResponseResponseR r,
        @Nullable ModelEnvironmentDefinitionResponseResponseSpark spark,
        @Nullable String version) {
        this.docker = docker;
        this.environmentVariables = environmentVariables;
        this.inferencingStackVersion = inferencingStackVersion;
        this.name = name;
        this.python = python;
        this.r = r;
        this.spark = spark;
        this.version = version;
    }

    private EnvironmentImageResponseResponseEnvironment() {
        this.docker = null;
        this.environmentVariables = Map.of();
        this.inferencingStackVersion = null;
        this.name = null;
        this.python = null;
        this.r = null;
        this.spark = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentImageResponseResponseEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ModelEnvironmentDefinitionResponseResponseDocker docker;
        private @Nullable Map<String,String> environmentVariables;
        private @Nullable String inferencingStackVersion;
        private @Nullable String name;
        private @Nullable ModelEnvironmentDefinitionResponseResponsePython python;
        private @Nullable ModelEnvironmentDefinitionResponseResponseR r;
        private @Nullable ModelEnvironmentDefinitionResponseResponseSpark spark;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentImageResponseResponseEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.docker = defaults.docker;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.inferencingStackVersion = defaults.inferencingStackVersion;
    	      this.name = defaults.name;
    	      this.python = defaults.python;
    	      this.r = defaults.r;
    	      this.spark = defaults.spark;
    	      this.version = defaults.version;
        }

        public Builder docker(@Nullable ModelEnvironmentDefinitionResponseResponseDocker docker) {
            this.docker = docker;
            return this;
        }
        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder inferencingStackVersion(@Nullable String inferencingStackVersion) {
            this.inferencingStackVersion = inferencingStackVersion;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder python(@Nullable ModelEnvironmentDefinitionResponseResponsePython python) {
            this.python = python;
            return this;
        }
        public Builder r(@Nullable ModelEnvironmentDefinitionResponseResponseR r) {
            this.r = r;
            return this;
        }
        public Builder spark(@Nullable ModelEnvironmentDefinitionResponseResponseSpark spark) {
            this.spark = spark;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public EnvironmentImageResponseResponseEnvironment build() {
            return new EnvironmentImageResponseResponseEnvironment(docker, environmentVariables, inferencingStackVersion, name, python, r, spark, version);
        }
    }
}
