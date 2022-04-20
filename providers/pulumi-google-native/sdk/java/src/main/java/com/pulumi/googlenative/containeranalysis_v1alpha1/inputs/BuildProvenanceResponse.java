// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.ArtifactResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.CommandResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.SourceResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Provenance of a build. Contains all information needed to verify the full details about the build from source to completion.
 * 
 */
public final class BuildProvenanceResponse extends com.pulumi.resources.InvokeArgs {

    public static final BuildProvenanceResponse Empty = new BuildProvenanceResponse();

    /**
     * Special options applied to this build. This is a catch-all field where build providers can enter any desired additional details.
     * 
     */
    @Import(name="buildOptions", required=true)
      private final Map<String,String> buildOptions;

    public Map<String,String> buildOptions() {
        return this.buildOptions;
    }

    /**
     * Version string of the builder at the time this build was executed.
     * 
     */
    @Import(name="builderVersion", required=true)
      private final String builderVersion;

    public String builderVersion() {
        return this.builderVersion;
    }

    /**
     * Output of the build.
     * 
     */
    @Import(name="builtArtifacts", required=true)
      private final List<ArtifactResponse> builtArtifacts;

    public List<ArtifactResponse> builtArtifacts() {
        return this.builtArtifacts;
    }

    /**
     * Commands requested by the build.
     * 
     */
    @Import(name="commands", required=true)
      private final List<CommandResponse> commands;

    public List<CommandResponse> commands() {
        return this.commands;
    }

    /**
     * Time at which the build was created.
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String createTime() {
        return this.createTime;
    }

    /**
     * E-mail address of the user who initiated this build. Note that this was the user&#39;s e-mail address at the time the build was initiated; this address may not represent the same end-user for all time.
     * 
     */
    @Import(name="creator", required=true)
      private final String creator;

    public String creator() {
        return this.creator;
    }

    /**
     * Time at which execution of the build was finished.
     * 
     */
    @Import(name="finishTime", required=true)
      private final String finishTime;

    public String finishTime() {
        return this.finishTime;
    }

    /**
     * Google Cloud Storage bucket where logs were written.
     * 
     */
    @Import(name="logsBucket", required=true)
      private final String logsBucket;

    public String logsBucket() {
        return this.logsBucket;
    }

    /**
     * ID of the project.
     * 
     */
    @Import(name="project", required=true)
      private final String project;

    public String project() {
        return this.project;
    }

    /**
     * Details of the Source input to the build.
     * 
     */
    @Import(name="sourceProvenance", required=true)
      private final SourceResponse sourceProvenance;

    public SourceResponse sourceProvenance() {
        return this.sourceProvenance;
    }

    /**
     * Time at which execution of the build was started.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    /**
     * Trigger identifier if the build was triggered automatically; empty if not.
     * 
     */
    @Import(name="triggerId", required=true)
      private final String triggerId;

    public String triggerId() {
        return this.triggerId;
    }

    public BuildProvenanceResponse(
        Map<String,String> buildOptions,
        String builderVersion,
        List<ArtifactResponse> builtArtifacts,
        List<CommandResponse> commands,
        String createTime,
        String creator,
        String finishTime,
        String logsBucket,
        String project,
        SourceResponse sourceProvenance,
        String startTime,
        String triggerId) {
        this.buildOptions = Objects.requireNonNull(buildOptions, "expected parameter 'buildOptions' to be non-null");
        this.builderVersion = Objects.requireNonNull(builderVersion, "expected parameter 'builderVersion' to be non-null");
        this.builtArtifacts = Objects.requireNonNull(builtArtifacts, "expected parameter 'builtArtifacts' to be non-null");
        this.commands = Objects.requireNonNull(commands, "expected parameter 'commands' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.creator = Objects.requireNonNull(creator, "expected parameter 'creator' to be non-null");
        this.finishTime = Objects.requireNonNull(finishTime, "expected parameter 'finishTime' to be non-null");
        this.logsBucket = Objects.requireNonNull(logsBucket, "expected parameter 'logsBucket' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.sourceProvenance = Objects.requireNonNull(sourceProvenance, "expected parameter 'sourceProvenance' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.triggerId = Objects.requireNonNull(triggerId, "expected parameter 'triggerId' to be non-null");
    }

    private BuildProvenanceResponse() {
        this.buildOptions = Map.of();
        this.builderVersion = null;
        this.builtArtifacts = List.of();
        this.commands = List.of();
        this.createTime = null;
        this.creator = null;
        this.finishTime = null;
        this.logsBucket = null;
        this.project = null;
        this.sourceProvenance = null;
        this.startTime = null;
        this.triggerId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildProvenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> buildOptions;
        private String builderVersion;
        private List<ArtifactResponse> builtArtifacts;
        private List<CommandResponse> commands;
        private String createTime;
        private String creator;
        private String finishTime;
        private String logsBucket;
        private String project;
        private SourceResponse sourceProvenance;
        private String startTime;
        private String triggerId;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildProvenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildOptions = defaults.buildOptions;
    	      this.builderVersion = defaults.builderVersion;
    	      this.builtArtifacts = defaults.builtArtifacts;
    	      this.commands = defaults.commands;
    	      this.createTime = defaults.createTime;
    	      this.creator = defaults.creator;
    	      this.finishTime = defaults.finishTime;
    	      this.logsBucket = defaults.logsBucket;
    	      this.project = defaults.project;
    	      this.sourceProvenance = defaults.sourceProvenance;
    	      this.startTime = defaults.startTime;
    	      this.triggerId = defaults.triggerId;
        }

        public Builder buildOptions(Map<String,String> buildOptions) {
            this.buildOptions = Objects.requireNonNull(buildOptions);
            return this;
        }
        public Builder builderVersion(String builderVersion) {
            this.builderVersion = Objects.requireNonNull(builderVersion);
            return this;
        }
        public Builder builtArtifacts(List<ArtifactResponse> builtArtifacts) {
            this.builtArtifacts = Objects.requireNonNull(builtArtifacts);
            return this;
        }
        public Builder builtArtifacts(ArtifactResponse... builtArtifacts) {
            return builtArtifacts(List.of(builtArtifacts));
        }
        public Builder commands(List<CommandResponse> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }
        public Builder commands(CommandResponse... commands) {
            return commands(List.of(commands));
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder creator(String creator) {
            this.creator = Objects.requireNonNull(creator);
            return this;
        }
        public Builder finishTime(String finishTime) {
            this.finishTime = Objects.requireNonNull(finishTime);
            return this;
        }
        public Builder logsBucket(String logsBucket) {
            this.logsBucket = Objects.requireNonNull(logsBucket);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder sourceProvenance(SourceResponse sourceProvenance) {
            this.sourceProvenance = Objects.requireNonNull(sourceProvenance);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder triggerId(String triggerId) {
            this.triggerId = Objects.requireNonNull(triggerId);
            return this;
        }        public BuildProvenanceResponse build() {
            return new BuildProvenanceResponse(buildOptions, builderVersion, builtArtifacts, commands, createTime, creator, finishTime, logsBucket, project, sourceProvenance, startTime, triggerId);
        }
    }
}
