// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.enums.IncidentClassification;
import io.pulumi.azurenative.securityinsights.enums.IncidentClassificationReason;
import io.pulumi.azurenative.securityinsights.enums.IncidentSeverity;
import io.pulumi.azurenative.securityinsights.enums.IncidentStatus;
import io.pulumi.azurenative.securityinsights.inputs.IncidentLabelArgs;
import io.pulumi.azurenative.securityinsights.inputs.IncidentOwnerInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IncidentArgs extends io.pulumi.resources.ResourceArgs {

    public static final IncidentArgs Empty = new IncidentArgs();

    /**
     * The reason the incident was closed
     * 
     */
    @Import(name="classification")
      private final @Nullable Output<Either<String,IncidentClassification>> classification;

    public Output<Either<String,IncidentClassification>> classification() {
        return this.classification == null ? Codegen.empty() : this.classification;
    }

    /**
     * Describes the reason the incident was closed
     * 
     */
    @Import(name="classificationComment")
      private final @Nullable Output<String> classificationComment;

    public Output<String> classificationComment() {
        return this.classificationComment == null ? Codegen.empty() : this.classificationComment;
    }

    /**
     * The classification reason the incident was closed with
     * 
     */
    @Import(name="classificationReason")
      private final @Nullable Output<Either<String,IncidentClassificationReason>> classificationReason;

    public Output<Either<String,IncidentClassificationReason>> classificationReason() {
        return this.classificationReason == null ? Codegen.empty() : this.classificationReason;
    }

    /**
     * The description of the incident
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The time of the first activity in the incident
     * 
     */
    @Import(name="firstActivityTimeUtc")
      private final @Nullable Output<String> firstActivityTimeUtc;

    public Output<String> firstActivityTimeUtc() {
        return this.firstActivityTimeUtc == null ? Codegen.empty() : this.firstActivityTimeUtc;
    }

    /**
     * Incident ID
     * 
     */
    @Import(name="incidentId")
      private final @Nullable Output<String> incidentId;

    public Output<String> incidentId() {
        return this.incidentId == null ? Codegen.empty() : this.incidentId;
    }

    /**
     * List of labels relevant to this incident
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<IncidentLabelArgs>> labels;

    public Output<List<IncidentLabelArgs>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The time of the last activity in the incident
     * 
     */
    @Import(name="lastActivityTimeUtc")
      private final @Nullable Output<String> lastActivityTimeUtc;

    public Output<String> lastActivityTimeUtc() {
        return this.lastActivityTimeUtc == null ? Codegen.empty() : this.lastActivityTimeUtc;
    }

    /**
     * Describes a user that the incident is assigned to
     * 
     */
    @Import(name="owner")
      private final @Nullable Output<IncidentOwnerInfoArgs> owner;

    public Output<IncidentOwnerInfoArgs> owner() {
        return this.owner == null ? Codegen.empty() : this.owner;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The severity of the incident
     * 
     */
    @Import(name="severity", required=true)
      private final Output<Either<String,IncidentSeverity>> severity;

    public Output<Either<String,IncidentSeverity>> severity() {
        return this.severity;
    }

    /**
     * The status of the incident
     * 
     */
    @Import(name="status", required=true)
      private final Output<Either<String,IncidentStatus>> status;

    public Output<Either<String,IncidentStatus>> status() {
        return this.status;
    }

    /**
     * The title of the incident
     * 
     */
    @Import(name="title", required=true)
      private final Output<String> title;

    public Output<String> title() {
        return this.title;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    public IncidentArgs(
        @Nullable Output<Either<String,IncidentClassification>> classification,
        @Nullable Output<String> classificationComment,
        @Nullable Output<Either<String,IncidentClassificationReason>> classificationReason,
        @Nullable Output<String> description,
        @Nullable Output<String> firstActivityTimeUtc,
        @Nullable Output<String> incidentId,
        @Nullable Output<List<IncidentLabelArgs>> labels,
        @Nullable Output<String> lastActivityTimeUtc,
        @Nullable Output<IncidentOwnerInfoArgs> owner,
        Output<String> resourceGroupName,
        Output<Either<String,IncidentSeverity>> severity,
        Output<Either<String,IncidentStatus>> status,
        Output<String> title,
        Output<String> workspaceName) {
        this.classification = classification;
        this.classificationComment = classificationComment;
        this.classificationReason = classificationReason;
        this.description = description;
        this.firstActivityTimeUtc = firstActivityTimeUtc;
        this.incidentId = incidentId;
        this.labels = labels;
        this.lastActivityTimeUtc = lastActivityTimeUtc;
        this.owner = owner;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private IncidentArgs() {
        this.classification = Codegen.empty();
        this.classificationComment = Codegen.empty();
        this.classificationReason = Codegen.empty();
        this.description = Codegen.empty();
        this.firstActivityTimeUtc = Codegen.empty();
        this.incidentId = Codegen.empty();
        this.labels = Codegen.empty();
        this.lastActivityTimeUtc = Codegen.empty();
        this.owner = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.severity = Codegen.empty();
        this.status = Codegen.empty();
        this.title = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,IncidentClassification>> classification;
        private @Nullable Output<String> classificationComment;
        private @Nullable Output<Either<String,IncidentClassificationReason>> classificationReason;
        private @Nullable Output<String> description;
        private @Nullable Output<String> firstActivityTimeUtc;
        private @Nullable Output<String> incidentId;
        private @Nullable Output<List<IncidentLabelArgs>> labels;
        private @Nullable Output<String> lastActivityTimeUtc;
        private @Nullable Output<IncidentOwnerInfoArgs> owner;
        private Output<String> resourceGroupName;
        private Output<Either<String,IncidentSeverity>> severity;
        private Output<Either<String,IncidentStatus>> status;
        private Output<String> title;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(IncidentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.classificationComment = defaults.classificationComment;
    	      this.classificationReason = defaults.classificationReason;
    	      this.description = defaults.description;
    	      this.firstActivityTimeUtc = defaults.firstActivityTimeUtc;
    	      this.incidentId = defaults.incidentId;
    	      this.labels = defaults.labels;
    	      this.lastActivityTimeUtc = defaults.lastActivityTimeUtc;
    	      this.owner = defaults.owner;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
    	      this.title = defaults.title;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder classification(@Nullable Output<Either<String,IncidentClassification>> classification) {
            this.classification = classification;
            return this;
        }
        public Builder classification(@Nullable Either<String,IncidentClassification> classification) {
            this.classification = Codegen.ofNullable(classification);
            return this;
        }
        public Builder classificationComment(@Nullable Output<String> classificationComment) {
            this.classificationComment = classificationComment;
            return this;
        }
        public Builder classificationComment(@Nullable String classificationComment) {
            this.classificationComment = Codegen.ofNullable(classificationComment);
            return this;
        }
        public Builder classificationReason(@Nullable Output<Either<String,IncidentClassificationReason>> classificationReason) {
            this.classificationReason = classificationReason;
            return this;
        }
        public Builder classificationReason(@Nullable Either<String,IncidentClassificationReason> classificationReason) {
            this.classificationReason = Codegen.ofNullable(classificationReason);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder firstActivityTimeUtc(@Nullable Output<String> firstActivityTimeUtc) {
            this.firstActivityTimeUtc = firstActivityTimeUtc;
            return this;
        }
        public Builder firstActivityTimeUtc(@Nullable String firstActivityTimeUtc) {
            this.firstActivityTimeUtc = Codegen.ofNullable(firstActivityTimeUtc);
            return this;
        }
        public Builder incidentId(@Nullable Output<String> incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Builder incidentId(@Nullable String incidentId) {
            this.incidentId = Codegen.ofNullable(incidentId);
            return this;
        }
        public Builder labels(@Nullable Output<List<IncidentLabelArgs>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<IncidentLabelArgs> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder labels(IncidentLabelArgs... labels) {
            return labels(List.of(labels));
        }
        public Builder lastActivityTimeUtc(@Nullable Output<String> lastActivityTimeUtc) {
            this.lastActivityTimeUtc = lastActivityTimeUtc;
            return this;
        }
        public Builder lastActivityTimeUtc(@Nullable String lastActivityTimeUtc) {
            this.lastActivityTimeUtc = Codegen.ofNullable(lastActivityTimeUtc);
            return this;
        }
        public Builder owner(@Nullable Output<IncidentOwnerInfoArgs> owner) {
            this.owner = owner;
            return this;
        }
        public Builder owner(@Nullable IncidentOwnerInfoArgs owner) {
            this.owner = Codegen.ofNullable(owner);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder severity(Output<Either<String,IncidentSeverity>> severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder severity(Either<String,IncidentSeverity> severity) {
            this.severity = Output.of(Objects.requireNonNull(severity));
            return this;
        }
        public Builder status(Output<Either<String,IncidentStatus>> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(Either<String,IncidentStatus> status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }
        public Builder title(Output<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder title(String title) {
            this.title = Output.of(Objects.requireNonNull(title));
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public IncidentArgs build() {
            return new IncidentArgs(classification, classificationComment, classificationReason, description, firstActivityTimeUtc, incidentId, labels, lastActivityTimeUtc, owner, resourceGroupName, severity, status, title, workspaceName);
        }
    }
}
