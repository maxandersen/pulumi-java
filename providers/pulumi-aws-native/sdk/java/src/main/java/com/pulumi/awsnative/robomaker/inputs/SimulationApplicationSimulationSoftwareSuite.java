// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.robomaker.inputs;

import com.pulumi.awsnative.robomaker.enums.SimulationApplicationSimulationSoftwareSuiteName;
import com.pulumi.awsnative.robomaker.enums.SimulationApplicationSimulationSoftwareSuiteVersion;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about a simulation software suite.
 * 
 */
public final class SimulationApplicationSimulationSoftwareSuite extends com.pulumi.resources.InvokeArgs {

    public static final SimulationApplicationSimulationSoftwareSuite Empty = new SimulationApplicationSimulationSoftwareSuite();

    /**
     * The name of the simulation software suite.
     * 
     */
    @Import(name="name", required=true)
    private SimulationApplicationSimulationSoftwareSuiteName name;

    public SimulationApplicationSimulationSoftwareSuiteName name() {
        return this.name;
    }

    /**
     * The version of the simulation software suite.
     * 
     */
    @Import(name="version")
    private @Nullable SimulationApplicationSimulationSoftwareSuiteVersion version;

    public Optional<SimulationApplicationSimulationSoftwareSuiteVersion> version() {
        return Optional.ofNullable(this.version);
    }

    private SimulationApplicationSimulationSoftwareSuite() {}

    private SimulationApplicationSimulationSoftwareSuite(SimulationApplicationSimulationSoftwareSuite $) {
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SimulationApplicationSimulationSoftwareSuite defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SimulationApplicationSimulationSoftwareSuite $;

        public Builder() {
            $ = new SimulationApplicationSimulationSoftwareSuite();
        }

        public Builder(SimulationApplicationSimulationSoftwareSuite defaults) {
            $ = new SimulationApplicationSimulationSoftwareSuite(Objects.requireNonNull(defaults));
        }

        public Builder name(SimulationApplicationSimulationSoftwareSuiteName name) {
            $.name = name;
            return this;
        }

        public Builder version(@Nullable SimulationApplicationSimulationSoftwareSuiteVersion version) {
            $.version = version;
            return this;
        }

        public SimulationApplicationSimulationSoftwareSuite build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
